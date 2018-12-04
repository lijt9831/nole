package com.jxyd.nole.bas.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	/**
	 * <p>
	 * Checks if a CharSequence is whitespace, empty ("") or null.
	 * </p>
	 *
	 * <pre>
	 * StringUtils.isBlank(null)      = true
	 * StringUtils.isBlank("")        = true
	 * StringUtils.isBlank(" ")       = true
	 * StringUtils.isBlank("bob")     = false
	 * StringUtils.isBlank("  bob  ") = false
	 * </pre>
	 *
	 * @param cs the CharSequence to check, may be null
	 * @return {@code true} if the CharSequence is null, empty or whitespace
	 */
	public static boolean isBlank(final CharSequence cs) {
		int strLen;
		if (cs == null || (strLen = cs.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if (Character.isWhitespace(cs.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNotBlank(final CharSequence cs) {
		return !isBlank(cs);
	}
	
	/**
	 * @param content 暗暗[eeee]阿那那那
	 * @param left [
	 * @param right ]
	 * @return eeee
	 */
	public static String maxcut(String content, String left, String right) {
		int index1 = content.indexOf(left);
		int index2 = content.lastIndexOf(right);
		if (index1 == -1 || index2 == -1 || index1 >= index2) {
			return "";
		}
		return content.substring(left.isEmpty() ? 0 : index1 + 1, index2);
	}
	
	/**
	 * @param s how_are_you 或 HOW_ARE_YOU
	 * @return HowAreYou
	 */
	public static String upperCamel(String s) {
		if (s == null || s.isEmpty())
			return s;
		StringBuffer sb = new StringBuffer();
		s = s.toLowerCase();
		String[] splits = s.split("_|\\.");
		for (String split : splits) {
			sb.append(split.substring(0, 1).toUpperCase());
			sb.append(split.substring(1));
		}
		return sb.toString();
	}

	/**
	 * @param s how_are_you 或  HOW_ARE_YOU
	 * @return howAreYou
	 */
	public static String lowerCamel(String s) {
		if (s == null || s.isEmpty())
			return s;
		StringBuffer sb = new StringBuffer();
		s = s.toLowerCase();
		String[] splits = s.split("_|\\.");
		for (int i = 0; i < splits.length; i++) {
			String split = splits[i];
			if (i == 0) {
				sb.append(split);
			} else {
				sb.append(split.substring(0, 1).toUpperCase());
				sb.append(split.substring(1));
			}
		}
		return sb.toString();
	}
	
	/**
	 * unicode转字符
	 * @param s
	 * @return
	 */
	public static String unicodeToString(String s) {
		Pattern pattern = Pattern.compile("(\\\\u([0-9a-fA-F]{4}))");
		Matcher matcher = pattern.matcher(s);
		char c;
		while (matcher.find()) {
			c = (char) Integer.parseInt(matcher.group(2), 16);
			s = s.replace(matcher.group(1), String.valueOf(c));
		}
		return s;
	}
}
