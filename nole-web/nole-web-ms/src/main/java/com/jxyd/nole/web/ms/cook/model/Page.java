package com.jxyd.nole.web.ms.cook.model;

import org.apache.ibatis.session.RowBounds;

public class Page {
	private int pageSize;
	private int pageNum;

	public RowBounds getRowBounds() {
		int _pageSize = pageSize <= 0 ? 10 : pageSize;
		return new RowBounds(pageNum * _pageSize, _pageSize);
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

}
