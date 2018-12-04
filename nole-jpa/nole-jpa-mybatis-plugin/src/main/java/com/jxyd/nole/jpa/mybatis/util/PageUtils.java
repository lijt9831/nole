package com.jxyd.nole.jpa.mybatis.util;

import org.apache.ibatis.session.RowBounds;

/**
 * @author zxg
 *
 */
public class PageUtils {

	private static final int DEFAULT_PAGE_SIZE = 20;

	/**
	 * 根据页码和页容量生成 <code>RowBounds</code>
	 * 
	 * @param pageNum
	 *            页码，当<=0 时，设置为1
	 * @param pageSize
	 *            页容量，当<=0时，设置为20
	 * @Param withCount 是否返回总条数
	 * @return
	 */
	public static RowBounds getRowBounds(int pageNum, int pageSize, boolean withCount) {
		pageNum = pageNum <= 0 ? 1 : pageNum;
		pageSize = pageSize <= 0 ? DEFAULT_PAGE_SIZE : pageSize;
		return new RowBounds((pageNum - 1) * pageSize, pageSize);
	}

	/**
	 * 根据页码生成 <code>RowBounds</code>，页容量默认为20
	 * 
	 * @param pageNum
	 *            页码，当<=0 时，设置为1
	 * @return
	 */
	public static RowBounds getRowBounds(int pageNum) {
		return getRowBounds(pageNum, DEFAULT_PAGE_SIZE, false);
	}

	/**
	 * @param pageNum
	 *            页码，当<=0 时，设置为1
	 * @param pageSize
	 *            页容量，当<=0时，设置为20
	 * @param withCount
	 *            是否返回总条数
	 * @return
	 */
	public static RowBoundx getRowBoundsWithCount(int pageNum, int pageSize, boolean withCount) {
		pageNum = pageNum <= 0 ? 1 : pageNum;
		pageSize = pageSize <= 0 ? DEFAULT_PAGE_SIZE : pageSize;
		return new RowBoundx((pageNum - 1) * pageSize, pageSize);
	}

	/**
	 * 根据页码生成 <code>RowBoundx</code>，页容量默认为20
	 * 
	 * @param pageNum
	 *            页码，当<=0 时，设置为1
	 * @return
	 */
	public static RowBoundx getRowBoundsWithCount(int pageNum) {
		return getRowBoundsWithCount(pageNum, DEFAULT_PAGE_SIZE, true);
	}

	/**
	 * 计算页数
	 * 
	 * @param totalSize
	 *            总条数
	 * @param pageSize
	 *            页容量
	 * @return
	 */
	public static int getTotalPageNum(int totalSize, int pageSize) {
		if (totalSize < 0 || pageSize < 0) {
			return 0;
		}
		return totalSize % pageSize == 0 ? totalSize / pageSize : totalSize / pageSize + 1;
	}

	/**
	 * 计算页，默认页容量是20
	 * 
	 * @param totalSize
	 * @return
	 */
	public static int getTotalPageNum(int totalSize) {
		return getTotalPageNum(totalSize, DEFAULT_PAGE_SIZE);
	}

	/**
	 * 计算页，默认页容量是20
	 * 
	 * @param totalSize
	 * @return
	 */
	public static int getTotalPageNum(long totalSize) {
		return getTotalPageNum(Integer.valueOf(String.valueOf(totalSize)), DEFAULT_PAGE_SIZE);
	}

}
