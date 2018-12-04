package com.jxyd.nole.jpa.mybatis.plugin.sh;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandlerRegistry;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;


public class SqlUtils {
	
	private final Log log = LogFactory.getLog(SqlUtils.class);
	private static volatile SqlFormatter formatter;


	/**
	 * 获取完整sql 
	 * 
	 * @param boundSql
	 * @param dialect MYSQL、ORACLE
	 * @return
	 */
	public static String format(BoundSql boundSql ,String dialect) {
		List<Object> list = new ArrayList<Object>();

		TypeHandlerRegistry typeHandlerRegistry = new TypeHandlerRegistry();
		Configuration configuration = new Configuration();
		
		List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
		Object parameterObject = boundSql.getParameterObject();
		String sql = boundSql.getSql();
		
		if (parameterMappings != null) {
			for (int i = 0; i < parameterMappings.size(); i++) {
				ParameterMapping parameterMapping = parameterMappings.get(i);
				if (parameterMapping.getMode() != ParameterMode.OUT) {
					Object value;
					String propertyName = parameterMapping.getProperty();
					if (boundSql.hasAdditionalParameter(propertyName)) {
						value = boundSql.getAdditionalParameter(propertyName);
					} else if (parameterObject == null) {
						value = null;
					} else if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
						value = parameterObject;
					} else {
						value = configuration.newMetaObject(parameterObject).getValue(propertyName);
					}
					JdbcType jdbcType = parameterMapping.getJdbcType();
					if (value == null && jdbcType == null) {
						jdbcType = configuration.getJdbcTypeForNull();
					}
					list.add(value);
				}
			}
		}
		Object[] array = list.toArray();

		StringTokenizer whitespaceStripper = new StringTokenizer(SqlUtils.check(sql, array ,dialect));
		StringBuilder builder = new StringBuilder();
		while (whitespaceStripper.hasMoreTokens()) {
			builder.append(whitespaceStripper.nextToken());
			builder.append(" ");
		}
		return builder.toString();
	}
	
	private static String check(String filteredSql, Object[] variables ,String dialect) {
		if (formatter == null) {
			synchronized (SqlUtils.class) {
				if (formatter == null) {
					if ("ORACLE".equalsIgnoreCase(dialect)) {
						formatter = new OracleSqlFormatter();
					} else if ("MYSQL".equalsIgnoreCase(dialect)) {
						formatter = new MysqlSqlFormatter();
					} else {
						throw new RuntimeException("Unsupport type:" + dialect);
					}
				}
			}
		}
		
		StringTokenizer st = new StringTokenizer(filteredSql, "?");
		int count = 1;
		StringBuffer statement = new StringBuffer();
		while (st.hasMoreTokens()) {
			statement.append(st.nextToken());
			if (count <= variables.length) {
				if (variables[count - 1] != null) {
					try {
						statement.append(formatter.format(variables[count - 1]));
					} catch (SQLException e) {
						statement.append("SQLException");
					}
				} else {
					statement.append("? " + "(missing variable # " + count + " ) ");
				}
			}
			count++;
		}
		// unfilter the string in case there where rogue '?' in query string.
		char[] unfilterSql = statement.toString().toCharArray();
		for (int i = 0; i < unfilterSql.length; i++) {
			if (unfilterSql[i] == '\u0007')
				unfilterSql[i] = '?';
		}

		return new String(unfilterSql);
	}
}
