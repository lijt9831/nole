package com.jxyd.nole.bas.util;

import java.util.Date;
import java.util.Random;

public class OrderUtils {
	
	private static char[] charset = {'a','b','c','d','e','f','g','h','i','g','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','G','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
	
	/**
	 * 根据手机号生成第三方交易ID （32位）<br>
	 * 格式:TXphone_yyyymmddhh24miss_三位随机字符串(数字，大小写字母)<br>
	 * 举例:TX13444444444_201804021026_a8X
	 * @param phone
	 * @return
	 */
	public static String generateTransactionId(String phone) {
		boolean checked = RegExpUtils.check(phone, RegExpUtils.p_mobilephone);
		if (!checked) {
			throw new RuntimeException("手机号[" + phone + "]格式有误");
		}
		Random random = new Random();
		StringBuffer sb = new StringBuffer(32);
		sb.append("TX");
		sb.append(phone);
		sb.append("_");
		String time = DateUtils.format(new Date(), DateUtils.TIME_1);
		sb.append(time);
		sb.append("_");
		for (int i = 0; i < 3; i++) {
			char c = charset[random.nextInt(charset.length)];
			sb.append(c);
		}
		
		return sb.toString();
	}

}
