package com.jxyd.nole.bas.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckUtilsTest {

	@Test
	public void testCheckNull() {
		From from = new From();
		To checkNull = CheckUtils.checkNull(from,To.class);
		System.out.println(checkNull);
	}

}

