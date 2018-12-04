package com.jxyd.nole.bas.secu;

import org.junit.Test;

public class SensitiveUtilsTest {

	@Test
	public void testMatch() {
		boolean match = SensitiveUtils.match("傻逼");
		System.out.println(match);
	}

}
