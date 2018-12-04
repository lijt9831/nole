package com.jxyd.nole.jpa.mybatis.plugin.sh;


import java.lang.reflect.InvocationTargetException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.ResultHandler;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.MD5Utils;


@Intercepts({
	@Signature(type = StatementHandler.class, method = "query", args = { Statement.class ,ResultHandler.class}) })
public class QueryPlugin implements Interceptor{

	private final Log log = LogFactory.getLog(QueryPlugin.class);
	
	@SuppressWarnings("unused")
	private Properties properties;
	
	public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException {

		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		DefaultObjectFactory objectFactory = new DefaultObjectFactory();
		DefaultObjectWrapperFactory objectWrapperFactory = new DefaultObjectWrapperFactory();
		DefaultReflectorFactory reflectorFactory = new DefaultReflectorFactory();

		MetaObject metaObject = MetaObject.forObject(statementHandler, objectFactory, objectWrapperFactory, reflectorFactory);
		BoundSql boundSql = (BoundSql) metaObject.getValue("boundSql");
		
		String dialect = properties.getProperty("dialect");
		
		String sql = SqlUtils.format(boundSql ,dialect);
		String md5 = MD5Utils.md5HashToHex(sql);
		log.elapseStart(md5);
		Object proceed = invocation.proceed();
		log.elapseEnd(sql + ";--", md5);
		return proceed;
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		this.properties = properties;
		
	}
}
