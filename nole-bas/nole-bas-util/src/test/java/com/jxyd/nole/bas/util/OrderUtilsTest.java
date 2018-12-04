package com.jxyd.nole.bas.util;

import org.junit.Test;

public class OrderUtilsTest {

	@Test
	public void testGenerateTransactionId() {
		String generateTransactionId = OrderUtils.generateTransactionId("13444444444");
		System.out.println(generateTransactionId);
	}

}
