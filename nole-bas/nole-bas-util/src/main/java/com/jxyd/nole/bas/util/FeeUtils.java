package com.jxyd.nole.bas.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;


/**
 * 1）以元为单位，精确到分 <br>
 * 2）BigDecimal.ROUND_HALF_EVEN (Banker's rounding) <br>
 * 
 * @author zxg
 *
 */
public class FeeUtils {

	private static final Log LOG = LogFactory.getLog(FeeUtils.class);
	private static final int SCALE = 2;

	/**
	 * a + b = ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal jia(BigDecimal a, BigDecimal b) {
		if (a == null || b == null) {
			throw new RuntimeException("加法参数错误,a:[" + a + "],b:[" + b + "]");
		}
		BigDecimal add = a.add(b);
		BigDecimal result = add.setScale(SCALE, RoundingMode.HALF_EVEN);
		if (LOG.isDebugEnabled()) {
			String str;
			int scale = add.scale();
			if (scale > SCALE) {
				str = "[" + a + " + " + b + " = " + add + " ≈ " + result + "]";
			} else if(scale == SCALE) {
				str = "[" + a + " + " + b + " = " + add + "]";
			} else {
				str = "[" + a + " + " + b + " = " + add + " = " + result + "]";
			}
			LOG.debug(str);
		}
		return result;
	}

	/**
	 * a - b = ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal jian(BigDecimal a, BigDecimal b) {
		if (a == null || b == null) {
			throw new RuntimeException("减法参数错误,a:[" + a + "],b:[" + b + "]");
		}
		BigDecimal subtract = a.subtract(b);
		BigDecimal result = subtract.setScale(SCALE, RoundingMode.HALF_EVEN);
		if (LOG.isDebugEnabled()) {
			String str;
			int scale = subtract.scale();
			if (scale > SCALE) {
				str = "[" + a + " - " + b + " = " + subtract + " ≈ " + result + "]";
			} else if(scale == SCALE) {
				str = "[" + a + " - " + b + " = " + subtract + "]";
			} else {
				str = "[" + a + " - " + b + " = " + subtract + " = " + result + "]";
			}
			LOG.debug(str);
		}
		
		return result;
	}

	/**
	 * a * b = ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal cheng(BigDecimal a, BigDecimal b) {
		if (a == null || b == null) {
			throw new RuntimeException("乘法参数错误,a:[" + a + "],b:[" + b + "]");
		}
		BigDecimal multiply = a.multiply(b);
		BigDecimal result = multiply.setScale(SCALE, RoundingMode.HALF_EVEN);
		if (LOG.isDebugEnabled()) {
			String str;
			int scale = multiply.scale();
			if (scale > SCALE) {
				str = "[" + a + " * " + b + " = " + multiply + " ≈ " + result + "]";
			} else if(scale == SCALE) {
				str = "[" + a + " * " + b + " = " + multiply + "]";
			} else {
				str = "[" + a + " * " + b + " = " + multiply + " = " + result + "]";
			}
			LOG.debug(str);
		}
		return result;
	}

	/**
	 * a / b = ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static BigDecimal chu(BigDecimal a, BigDecimal b) {
		if (a == null || b == null || BigDecimal.ZERO.equals(b)) {
			throw new RuntimeException("除法参数错误,a:[" + a + "],b:[" + b + "]");
		}
		boolean near = false;
		BigDecimal divide;
		try {
			divide = a.divide(b);
		} catch (ArithmeticException e) {
			divide = a.divide(b, SCALE, RoundingMode.HALF_EVEN);
			near = true;
		}
		BigDecimal result = divide.setScale(SCALE, RoundingMode.HALF_EVEN);
		if (LOG.isDebugEnabled()) {
			String str;
			int scale = divide.scale();
			if (scale > SCALE) {
				str = "[" + a + " / " + b + " = " + divide + " ≈ " + result + "]";
			} else if(scale == SCALE && near) {
				str = "[" + a + " / " + b + " ≈ " + divide + "]";
			} else if(scale == SCALE && !near) {
				str = "[" + a + " / " + b + " = " + divide + "]";
			} else {
				str = "[" + a + " / " + b + " = " + divide + " = " + result + "]";
			}
			LOG.debug(str);
		}
		return result;
	}

	/**
	 * a < b ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean a_lt_b(BigDecimal a, BigDecimal b) {
		if (a == null || b == null) {
			throw new RuntimeException("a_lt_b参数错误,a:[" + a + "],b:[" + b + "]");
		}
		int result = a.compareTo(b);
		boolean c = result == -1;
		if (LOG.isDebugEnabled()) {
			LOG.debug("[" + a + " < " + b + " is " + c + "]");
		}
		return c;
	}

	/**
	 * a > b ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean a_gt_b(BigDecimal a, BigDecimal b) {
		if (a == null || b == null) {
			throw new RuntimeException("a_gt_b参数错误,a:[" + a + "],b:[" + b + "]");
		}
		int result = a.compareTo(b);
		boolean c = result == 1;
		if (LOG.isDebugEnabled()) {
			LOG.debug("[" + a + " > " + b + " is " + c + "]");
		}
		return c;
	}

	/**
	 * a == b ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean a_eq_b(BigDecimal a, BigDecimal b) {
		if (a == null || b == null) {
			throw new RuntimeException("a_eq_b参数错误,a:[" + a + "],b:[" + b + "]");
		}
		int result = a.compareTo(b);
		boolean c = result == 0;
		if (LOG.isDebugEnabled()) {
			LOG.debug("[" + a + " == " + b + " is " + c + "]");
		}
		return c;
	}

	/**
	 * a <= b ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean a_lteq_b(BigDecimal a, BigDecimal b) {
		if (a == null || b == null) {
			throw new RuntimeException("a_lteq_b参数错误,a:[" + a + "],b:[" + b + "]");
		}
		int result = a.compareTo(b);
		boolean c = result == -1 || result == 0;
		if (LOG.isDebugEnabled()) {
			LOG.debug("[" + a + " <= " + b + " is " + c + "]");
		}
		return c;
	}

	/**
	 * a >= b ?
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean a_gteq_b(BigDecimal a, BigDecimal b) {
		if (a == null || b == null) {
			throw new RuntimeException("a_gteq_b参数错误,a:[" + a + "],b:[" + b + "]");
		}
		int result = a.compareTo(b);
		boolean c = result == 1 || result == 0;
		if (LOG.isDebugEnabled()) {
			LOG.debug("[" + a + " >= " + b + " is " + c + "]");
		}
		return c;
	}

	/**
	 * "Banker's rounding" <br>
	 * <br>
	 * 保留两位小数 <br>
	 * <br>
	 * 原文：Rounding mode to round towards the "nearest neighbor" unless both neighbors are equidistant, in which case, round towards the even neighbor.<br>
	 * 翻译：除非距离相等，否则向最近的一边舍入。当距离不相等时，舍入到偶数。<br>
	 * 解释：距离相等的意思一定要明白即<code>5[0]{0,}</code>，以下视为距离相等,谁的邻居，当前整体数的邻居<br>
	 * 举例：1.115 (保留两位小数，此时第三位小数0.005是距离相等)<br>
	 *     1.1150 (0.0050 同样距离相等)<br>
	 *     1.11500<br>
	 * 举例：1.1151(0.0051距离两边不相等)<br>
	 *     1.11501<br>
	 * <br>
	 * 原文：Behaves as for RoundingMode.HALF_UP if the digit to the left of the discarded fraction is odd;<br>
	 * 翻译：如果舍弃片段左边紧挨着的数字是奇数，则按照 HALF_UP (前提是距离相等)<br>
	 * 举例：1.115 -> 1.12<br>
	 *     1.11500 -> 1.12<br>
	 * <br>
	 * 原文：behaves as for RoundingMode.HALF_DOWN if it's even.<br>
	 * 翻译：如果左边紧挨着的是偶数，则按照HALF_DOWN (前提是距离相等) <br>
	 * 举例：1.1250 -> 1.12<br>
	 *     1.125000 -> 1.12<br>
	 * <br>
	 * 注：通过String构造BigDecimal 可以确保精度，不要用double构造BigDecimal，会导致距离不相等<br>
	 * <br>
	 * @param b
	 * @return
	 * @see java.math.RoundingMode.HALF_EVEN
	 */
	public static String format(BigDecimal b) {
		if (b == null) {
			throw new RuntimeException("格式化参数错误,b:[" + b + "]");
		}
		if (b.scale() != SCALE) {
			return b.setScale(SCALE, RoundingMode.HALF_EVEN).toString();
		} else {
			return b.toString();
		}
	}

	/**
	 * 123456.44 -> 123,456.44 <br>
	 * 1234567.44 -> 1,234,567.44 <br>
	 * 
	 * @param b
	 * @return
	 */
	public static String formatG(BigDecimal b) {
		String s = format(b);
		char[] charArray = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		int cnt = -1;
		if (!s.contains(".")) {
			cnt = 0;
		}
		for (int i = charArray.length - 1; i > -1; i--) {
			char c = charArray[i];
			sb.append(c);
			if ('.' == c) {
				cnt = 0;
			} else if (cnt >= 0) {
				cnt++;
			}
			if (cnt == 3 && i != 0) {
				sb.append(",");
				cnt = 0;
			}
		}
		return sb.reverse().toString();
	}
}
