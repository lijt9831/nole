package com.jxyd.nole.bas.util;

@SuppressWarnings("restriction")
public class Base64Utils {

	private final static sun.misc.BASE64Encoder base64Encoder = new sun.misc.BASE64Encoder();
	private final static sun.misc.BASE64Decoder base64Decoder = new sun.misc.BASE64Decoder();

	/**
	 * Base64-encode the given byte array to a String.
	 * 
	 * @param src
	 *            the original byte array (may be {@code null})
	 * @return the encoded byte array as a UTF-8 String (or {@code null} if the
	 *         input was {@code null})
	 */
	public static String encodeToString(byte[] src) {
		if (src == null)
			return null;
		return base64Encoder.encode(src);
	}

	/**
	 * Base64-decode the given byte array from an UTF-8 String.
	 * 
	 * @param src
	 *            the encoded UTF-8 String (may be {@code null})
	 * @return the original byte array (or {@code null} if the input was
	 *         {@code null})
	 */
	public static byte[] decodeFromString(String src) {
		if (src == null)
			return null;
		try {
			byte[] decodeBuffer = base64Decoder.decodeBuffer(src);
			return decodeBuffer;
		} catch (Exception e) {
			throw new RuntimeException("decodeFromString failed.", e);
		}
	}
}
