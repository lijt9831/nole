package com.jxyd.nole.jpa.mybatis.plugin;


public final class DialectFactory {
	
	private DialectFactory(){}

	public static Dialect getInstance(String databaseType) throws IllegalArgumentException {
		Dialect dialect = null;
		DBType type = null;
		if (databaseType != null) {
			type = DBType.valueOf(databaseType.toUpperCase());
		}
		if (type == null) {
			throw new IllegalArgumentException(
					"Dialect [" + databaseType + "] not exist ,please check your mybatisConfig.xml");
		}
		switch (type) {
		case MYSQL:
			dialect = new MysqlDialect();
			break;
		case ORACLE:
			dialect = new OracleDialect();
			break;
		default:
			break;
		}

		return dialect;
	}

}
