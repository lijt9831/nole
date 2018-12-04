package com.jxyd.nole.bas.util;

import java.util.regex.Pattern;

public class RegExpUtils {

	
	// ==================== 以下是通用 ===========================
	
	/** 验证座机号 ^(\d{3,4}-)\d{7,8}$ */
	public static Pattern p_telphone = Pattern.compile("^(\\d{3,4}-)\\d{7,8}$");
	
	/** 验证手机号码 ^1[3|4|5|6|7|8|9][0-9]{9}$ */
	public static Pattern p_mobilephone = Pattern.compile("^1[3|4|5|6|7|8|9][0-9]{9}$");
	
	/** 验证身份证号 (^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$) */
	public static Pattern p_id = Pattern.compile("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)");
	
	/** 验证Email地址 ^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$ */
	public static Pattern p_email = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
	
	/** 数字、26个英文字母或其组合 ^[A-Za-z0-9]+$ */
	public static Pattern p_num_alhpabeta = Pattern.compile("^[A-Za-z0-9]+$");
	
	/** 十进制数 ^[1-9][0-9]{0,}([.][0-9]+){0,1}$ */
	public static Pattern p_decimal = Pattern.compile("^[1-9][0-9]{0,}([.][0-9]+){0,1}$");
	
	/** 只有数字 ^[0-9]*$ */
	public static Pattern p_number = Pattern.compile("^[0-9]*$");
	
	/** 只有汉字 ^[\u4e00-\u9fa5]{0,}$ */
	public static Pattern p_hanzi = Pattern.compile("^[\\u4e00-\\u9fa5]{0,}$");
	
	/** 协议开头的url地址  ^http[s]{0,1}://([\w-]+\.)+[\w-]+(/[\w-./?%&=]*)?$ */
	public static Pattern p_http_url = Pattern.compile("^http[s]{0,1}://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$");
	
	/** 空白行 ^\n\s*\r$ */
	public static Pattern p_blank_line = Pattern.compile("^\\n\\s*\\r$");

	/** 空白 ^\s*$ */
	public static Pattern p_blank_string = Pattern.compile("^\\s*$");
	
	/** 首尾空白符 ^\s*|\s*$ */
	public static Pattern p_headerblank_or_tailblank = Pattern.compile("^\\s*|\\s*$");

	/** 验证qq号 ^[1-9][0-9]{4,}$ */
	public static Pattern p_qq = Pattern.compile("^[1-9][0-9]{4,}$");

	/** 验证邮编 ^[1-9]\d{5}(?!\d)$ */
	public static Pattern p_postcode = Pattern.compile("^[1-9]\\d{5}(?!\\d)$");

	/** 验证ip地址 ^([1-9]{1,3}\.){3}[1-9]$ */
	public static Pattern p_ip = Pattern.compile("^([1-9]{1,3}\\.){3}[1-9]{1,3}$");
	
	/** 验证mac地址 ^([A-Fa-f0-9]{2}\\:){5}[A-Fa-f0-9]$ */
	public static Pattern p_mac = Pattern.compile("^([A-Fa-f0-9]{2}-){5}[A-Fa-f0-9]{2}$");

	
	/**
	 * 校验输入是否符合指定的格式 
	 * 
	 * @param s
	 * @param p
	 * @return
	 */
	public static boolean check(String s, Pattern p) {
		if (p == null) {
			throw new IllegalArgumentException("Pattern can not be null.");
		}
		if (s == null) {
			return false;
		}
		return p.matcher(s).matches();
	}
}
