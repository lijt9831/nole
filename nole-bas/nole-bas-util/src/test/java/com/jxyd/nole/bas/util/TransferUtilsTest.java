package com.jxyd.nole.bas.util;

import org.junit.Test;

public class TransferUtilsTest {

	@Test
	public void testTransfer1() {
		From from = new From();
		from.setA(1);
		from.setB("test");
		from.setC(Long.valueOf("123"));
		
		To to = new To();
		TransferUtils.transfer(from, to);
		
		System.out.println(to);
	}
	
	@Test
	public void testTransfer2() {
		From from = new From();
		from.setA(1);
		from.setB("test");
		from.setC(Long.valueOf("123"));
		
		To to = TransferUtils.transfer(from, To.class);
		
		System.out.println(to);
	}

}
