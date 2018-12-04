package com.jxyd.nole.jpa.mybatis.plugin.sh;


import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.RowBounds;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.jpa.mybatis.plugin.Dialect;
import com.jxyd.nole.jpa.mybatis.plugin.DialectFactory;


@Intercepts({
		@Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class, Integer.class }) })
public class PreparePlugin implements Interceptor {
	
	private static final Log log = LogFactory.getLog(PreparePlugin.class);

	private Properties properties;

	public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException {

		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		DefaultObjectFactory objectFactory = new DefaultObjectFactory();
		DefaultObjectWrapperFactory objectWrapperFactory = new DefaultObjectWrapperFactory();
		DefaultReflectorFactory reflectorFactory = new DefaultReflectorFactory();

		MetaObject metaObject = MetaObject.forObject(statementHandler, objectFactory, objectWrapperFactory, reflectorFactory);
		paginate(invocation,metaObject);
		return invocation.proceed();
	}

	private void paginate(Invocation invocation, MetaObject metaObject) throws InvocationTargetException, IllegalAccessException {
		RowBounds rowBounds = (RowBounds) metaObject.getValue("delegate.rowBounds");
		if (rowBounds == null || rowBounds == RowBounds.DEFAULT) {
			return;
		}
		
		String dialectStr = properties.getProperty("dialect");
		Dialect dialect = DialectFactory.getInstance(dialectStr);
		
		String originalSql = (String) metaObject.getValue("delegate.boundSql.sql");
		String limitedSql = dialect.getLimitString(originalSql, rowBounds.getOffset(), rowBounds.getLimit());
		
		if (rowBounds instanceof com.jxyd.nole.jpa.mybatis.util.RowBoundx) {
			setTotal(invocation, metaObject);
		}

		metaObject.setValue("delegate.boundSql.sql", limitedSql);
		metaObject.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);
		metaObject.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);
	}

	private void setTotal(Invocation iv, MetaObject mo) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ParameterHandler ph = (ParameterHandler) mo.getValue("delegate.parameterHandler");
			String originalSql = (String) mo.getValue("delegate.boundSql.sql");
			String sql = "select count(*) as cnt from ( " + originalSql + " ) all_";
			Connection conn = (Connection) iv.getArgs()[0];
			ps = conn.prepareStatement(sql);
			ph.setParameters(ps);
			rs = ps.executeQuery();
			if (rs.next()) {
				mo.setValue("delegate.rowBounds.count", ((BigDecimal)rs.getObject(1)).intValue());
			}
		} catch (SQLException e) {
			log.error("统计总数失败",e);
		} finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
			} catch (SQLException ignore) {}
		}
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
