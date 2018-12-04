package com.jxyd.nole.bas.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegExpUtilsTest {


	@Test
	public void testCheck() {
		boolean check = RegExpUtils.check("13444444444", RegExpUtils.p_mobilephone);
		assertTrue(check);
		
		boolean check2 = RegExpUtils.check("xxx@ttt.com", RegExpUtils.p_email);
		assertTrue(check2);

		boolean check3 = RegExpUtils.check("https://www.cnblogs.com/mingforyou/p/3344489.html", RegExpUtils.p_http_url);
		assertTrue(check3);

		boolean check4 = RegExpUtils.check("192.168.4.4", RegExpUtils.p_ip);
		assertTrue(check4);

		boolean check5 = RegExpUtils.check("  		", RegExpUtils.p_blank_string);
		System.out.println(check5);
		assertTrue(check5);

		boolean check6 = RegExpUtils.check("中国", RegExpUtils.p_hanzi);
		assertTrue(check6);

		boolean check7 = RegExpUtils.check("sdf234234sdf", RegExpUtils.p_num_alhpabeta);
		assertTrue(check7);

        boolean check12 = RegExpUtils.check("123456789012345",RegExpUtils.p_id);
        assertTrue(check12);

        boolean check13= RegExpUtils.check("12345678901234512x",RegExpUtils.p_id);
        assertTrue(check13);

        boolean check14 = RegExpUtils.check("123456789012345678",RegExpUtils.p_id);
        assertTrue(check14);

        boolean check15= RegExpUtils.check("11.2",RegExpUtils.p_decimal);
        assertTrue(check15);

        boolean check16= RegExpUtils.check("112",RegExpUtils.p_number);
        assertTrue(check16);

        boolean check17= RegExpUtils.check("311300",RegExpUtils.p_postcode);
        assertTrue(check17);

        boolean check18= RegExpUtils.check("54-EE-75-D4-43-41",RegExpUtils.p_mac);
        assertTrue(check18);

	}

}
