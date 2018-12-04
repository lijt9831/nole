package com.jxyd.nole.jpa.mybatis.plugin;


public interface Dialect {

	public abstract String getLimitString(String sql, int skipResults, int maxResults);
}
