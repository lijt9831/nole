package com.jxyd.nole.bas.util;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testFormat() {
		String format ;
		format = DateUtils.format(new Date(), DateUtils.DATE_1);
		System.out.println(format);
		assertTrue(format.length() == 8);
		format = DateUtils.format(new Date(), DateUtils.DATE_2);
		System.out.println(format);
		assertTrue(format.contains("/"));
		format = DateUtils.format(new Date(), DateUtils.DATE_3);
		System.out.println(format);
		assertTrue(format.contains("-"));
		format = DateUtils.format(new Date(), DateUtils.DATE_4);
		System.out.println(format);
		assertTrue(format.contains("年"));
		format = DateUtils.format(new Date(), DateUtils.DATE_5);
		System.out.println(format);
	}

	@Test
	public void testParse() {
//		Date parse = DateUtils.parse("20180328001900", DateUtils.TIME_1);
//		System.out.println(parse);
		
		System.out.println(new Date().getTime()/1000);
	}

}
