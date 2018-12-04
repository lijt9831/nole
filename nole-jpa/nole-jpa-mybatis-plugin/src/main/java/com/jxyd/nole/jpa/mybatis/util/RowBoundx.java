package com.jxyd.nole.jpa.mybatis.util;

/**
 * 扩展 RowBounds ，可通过插件返回总条数
 * @author zxg
 *
 */
public class RowBoundx extends org.apache.ibatis.session.RowBounds {

	public RowBoundx(int offset, int limit) {
		this.offset = offset;
		this.limit = limit;
	}

	private int offset;
	private int limit;
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getOffset() {
		return offset;
	}

	public int getLimit() {
		return limit;
	}
}
