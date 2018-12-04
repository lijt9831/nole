package com.jxyd.nole.bas.util;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;


public class CaptchaUtils {

	private static final String DEFAULT_CAPTCHA_RANGE = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ";
	private static final Random RANDOM = new Random();

	/**
	 * 生成文本验证码
	 * 
	 * @param length
	 *            验证码长度
	 * @return
	 */
	public static String generate(int length) {
		return generate(length, DEFAULT_CAPTCHA_RANGE);
	}

	/**
	 * 使用指定字符集生成文本验证码
	 * 
	 * @param length
	 *            验证码长度
	 * @param captchaRange
	 *            验证码字符集
	 * @return
	 */
	public static String generate(int length, String captchaRange) {
		if (StringUtils.isBlank(captchaRange)) {
			captchaRange = DEFAULT_CAPTCHA_RANGE;
		}
		int rangeLength = captchaRange.length();
		Random random = new Random(System.currentTimeMillis());
		StringBuffer captcha = new StringBuffer(length);
		for (int i = 0; i < length; i++) {
			captcha.append(captchaRange.charAt(random.nextInt(rangeLength - 1)));
		}
		return captcha.toString();
	}

	/**
	 * 将文本验证码转为图片
	 * 
	 * @param captcha
	 */
	public static BufferedImage captcha2imge(String captcha) {
		return captcha2imge(200, 80, captcha);
	}

	/**
	 * 将文本验证码转为图片
	 * 
	 * @param w
	 * @param h
	 * @param captcha
	 */
	public static BufferedImage captcha2imge(int w, int h, String captcha) {
		int length = captcha.length();
		BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		Random rand = new Random();
		Graphics2D g2D = bi.createGraphics();
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		/* 设置边框色 */
		g2D.setColor(Color.GRAY);
		g2D.fillRect(0, 0, w, h);

		Color c = getRandomColor(200, 250);
		/* 设置背景色 */
		g2D.setColor(c);
		g2D.fillRect(0, 2, w, h - 4);

		/* 绘制干扰线 */
		g2D.setColor(getRandomColor(160, 200));
		for (int i = 0; i < 20; i++) {
			int x = RANDOM.nextInt(w - 1);
			int y = RANDOM.nextInt(h - 1);
			int xl = RANDOM.nextInt(6) + 1;
			int yl = RANDOM.nextInt(12) + 1;
			g2D.drawLine(x, y, x + xl + 40, y + yl + 20);
		}

		/* 添加噪点 */
		float yawpRate = 0.05f;
		int area = (int) (yawpRate * w * h);
		for (int i = 0; i < area; i++) {
			int x = RANDOM.nextInt(w);
			int y = RANDOM.nextInt(h);
			int rgb = getRandomRgb();
			bi.setRGB(x, y, rgb);
		}

		/* 使图片扭曲 */
		distort(g2D, w, h, c);

		g2D.setColor(getRandomColor(100, 160));
		int fontSize = h - 4;
		Font font = new Font("Algerian", Font.ITALIC, fontSize);
		g2D.setFont(font);
		char[] chars = captcha.toCharArray();
		for (int i = 0; i < length; i++) {
			AffineTransform affine = new AffineTransform();
			affine.setToRotation(Math.PI / 4 * rand.nextDouble() * (rand.nextBoolean() ? 1 : -1),
					(w / length) * i + fontSize / 2, h / 2);
			g2D.setTransform(affine);
			g2D.drawChars(chars, i, 1, ((w - 10) / length) * i + 5, h / 2 + fontSize / 2 - 10);
		}

		g2D.dispose();
		return bi;
	}

	private static Color getRandomColor(int start, int end) {
		if (start > 255)
			start = 255;
		if (end > 255)
			end = 255;
		int r = start + RANDOM.nextInt(end - start);
		int g = start + RANDOM.nextInt(end - start);
		int b = start + RANDOM.nextInt(end - start);
		return new Color(r, g, b);
	}

	private static int getRandomRgb() {
		int[] rgb = new int[3];
		for (int i = 0; i < 3; i++) {
			rgb[i] = RANDOM.nextInt(255);
		}
		Color color = new Color(rgb[0], rgb[1], rgb[2]);
		return color.getRGB();
	}

	private static void distort(Graphics g, int w, int h, Color color) {
		distortX(g, w, h, color);
		distortY(g, w, h, color);
	}

	private static void distortX(Graphics g, int w, int h, Color color) {

		boolean borderGap = true;
		int period = RANDOM.nextInt(2);
		int frames = 1;
		int phase = RANDOM.nextInt(2);

		for (int i = 0; i < h; i++) {
			double d = (double) (period >> 1)
					* Math.sin((double) i / (double) period + (2 * Math.PI * (double) phase) / (double) frames);
			g.copyArea(0, i, w, 1, (int) d, 0);
			if (borderGap) {
				g.setColor(color);
				g.drawLine((int) d, i, 0, i);
				g.drawLine((int) d + w, i, w, i);
			}
		}

	}

	private static void distortY(Graphics g, int w, int h, Color color) {

		boolean borderGap = true;
		int period = RANDOM.nextInt(40) + 10;
		int frames = 20;
		int phase = 7;

		for (int i = 0; i < w; i++) {
			double d = (double) (period >> 1)
					* Math.sin((double) i / (double) period + (2 * Math.PI * (double) phase) / (double) frames);
			g.copyArea(i, 0, 1, h, 0, (int) d);
			if (borderGap) {
				g.setColor(color);
				g.drawLine(i, (int) d, i, 0);
				g.drawLine(i, (int) d + h, i, h);
			}
		}
	}

}