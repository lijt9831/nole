package com.jxyd.nole.bas.secu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;

/**
 * @author zxg
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class SensitiveUtils {

	private static final Log log = LogFactory.getLog(SensitiveUtils.class);
	
	/**
	 * 敏感词库
	 */
	private static Map cache = new HashMap();

	/**
	 * 空字符串长度为0
	 */
	private static String EMPTY = "";

	/**
	 * 本工具类采用逐个字符匹配因此可以用双字符作为结束标志
	 */
	private static String END = "==";

	static {
		init();
	}

	/**
	 * 初始化
	 */
	private static void init() {
		ResourceBundle config = null;
		String path = null;
		try {
			log.info("尝试读取 env/config.properties 配置文件");
			config = ResourceBundle.getBundle("env/config");
		} catch (MissingResourceException e) {
			log.info("env/config.properties 配置文件不存在");
		}
		if (config != null) {
			try {
				log.info("尝试读取 sensitivewords_file_path 属性");
				path = config.getString("sensitivewords_file_path");
			} catch (MissingResourceException e) {
				log.info("sensitivewords_file_path 属性不存在");
			}
		}
		if (path == null) {
			path = "sensitivewords.txt";
		}
		log.info("尝试读取文件 :[" + path + "]");
		InputStream is = SensitiveUtils.class.getClassLoader().getResourceAsStream(path);

		if (is == null) {
			log.warn("文件:[" + path + "]不存在。");
			String msg = "初始化敏感词库失败！请在 env/config.properties 中通过 sensitivewords_file_path 属性指定敏感词库文件位置，或添加文件 sensitivewords.txt 到 classpath";
			log.error(msg);
			throw new RuntimeException(msg);
		}
		load(is, "UTF-8");
	}

	/**
	 * 扩展敏感词库，可多次调用进行扩展
	 * 
	 * @param list
	 */
	public static void load(List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			rollOut(it.next());
		}
	}

	/**
	 * 从配置文件中读取敏感词。配置文件应为文本文件，每一行是一个敏感词，格式如下：<br>
	 * 敏感词1<br>
	 * 敏感词2<br>
	 * 敏感词3<br>
	 * ...
	 * 
	 * @param file
	 */
	public static void load(File file) {
		if (file == null || !file.exists()) {
			throw new RuntimeException("敏感词配置文件不存在。file:[" + file == null ? "null" : file.getAbsolutePath() + "]");
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String l;
			while ((l = br.readLine()) != null) {
				rollOut(l);
			}
			br.close();
		} catch (IOException e) {
			throw new RuntimeException("读取敏感词配置文件失败。file:[" + file == null ? "null" : file.getAbsolutePath() + "]");
		}
	}

	/**
	 * 从流中读取敏感词
	 * 
	 * @param in
	 * @param charset
	 */
	public static void load(InputStream in, String charset) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in, charset));
			String l;
			while ((l = br.readLine()) != null) {
				rollOut(l);
			}
			br.close();
			log.info("初始化敏感词库成功！");
		} catch (IOException e) {
			throw new RuntimeException("从流中读取敏感词失败。流编码集：[" + charset + "]");
		}
	}

	/**
	 * 尝试扩展该敏感词
	 * 
	 * @param str
	 */
	private static void rollOut(String str) {
		String word = str.trim();
		Map current = null;
		Map increment = null;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			Object v = null;
			if (i == 0) {
				v = cache.get(c);
				if (v == null) {
					current = new HashMap();
					cache.put(c, current);
				} else {
					current = (Map) v;
				}
			} else {
				v = current.get(c);
				if (v == null) {
					increment = new HashMap();
					current.put(c, increment);
					current = increment;
				} else {
					current = (Map) v;
				}
			}

			if (i == word.length() - 1) {
				current.put(END, EMPTY);
			}
		}
	}

	/**
	 * 检出敏感词
	 * 
	 * @param section
	 *            文本段落
	 * @param deepth
	 *            期望检出敏感词数量，-1 时期望检出全部
	 * @return
	 */
	private static List<String> pickOut(String section, int deepth) {
		List<String> words = new ArrayList<String>();
		String word = EMPTY;
		Map current = null;
		for (int i = 0; i < section.length(); i++) {
			char c = section.charAt(i);
			Object v = null;
			if (current == null) {
				v = cache.get(c);
			} else {
				v = current.get(c);
			}
			if (v == null) {
				word = EMPTY;
				if (current != null) {
					current = null;
					i--;
				}
				continue;
			} else {
				current = (Map) v;
				word += c;
			}
			if (current.get(END) != null) {
				if (!words.contains(word)) {
					words.add(word);
				}
				word = EMPTY;
				current = null;
				if (deepth < 0 || words.size() < deepth) {
					continue;
				} else {
					break;
				}
			}
		}
		return words;
	}

	/**
	 * 检测文本段落是否包含敏感词
	 * 
	 * @param section
	 * @return true 包含 ， false 不
	 */
	public static boolean match(String section) {
		List<String> check = pickOut(section, 1);
		return check.size() == 1;
	}

	/**
	 * 期望检出第一个敏感词
	 * 
	 * @param section
	 * @return 没有敏感词时返回null
	 */
	public static String minMatch(String section) {
		List<String> words = pickOut(section, 1);
		return words.isEmpty() ? null : words.get(0);
	}

	/**
	 * 期望检出所有敏感词
	 * 
	 * @param section
	 * @return 没有敏感词时返回 size 为 0 的空List
	 */
	public static List<String> maxMatch(String section) {
		List<String> words = pickOut(section, -1);
		return words;
	}

	/**
	 * 默认覆盖方法使用星号<br>
	 * 例：我是敏感词<br>
	 * &nbsp;&nbsp;&nbsp;&nbsp;我是<code>***</code>
	 * 
	 * @param section
	 * @return coveredSection
	 */
	public static String cover(String section) {
		return cover(section, '*');
	}

	/**
	 * 通过提供的字符替换敏感词并返回替换后的文本， 当 replacement 为空白字字符时将移除敏感词<br>
	 * <br>
	 * 例1：替换符为星号<code>*</code><br>
	 * 我是敏感词吗<br>
	 * 我是***吗<br>
	 * <br>
	 * 例2：替换符为空白符号<code> </code><br>
	 * 我是敏感词吧<br>
	 * 我是吧
	 * 
	 * @param section
	 * @param replacement
	 * @return
	 */
	public static String cover(String section, char replacement) {
		String word = EMPTY;
		Map current = null;
		for (int i = 0; i < section.length(); i++) {
			char c = section.charAt(i);
			Object v = null;
			if (current == null) {
				v = cache.get(c);
			} else {
				v = current.get(c);
			}
			if (v == null) {
				word = EMPTY;
				if (current != null) {
					current = null;
					i--;
				}
				continue;
			} else {
				current = (Map) v;
				word += c;
			}
			if (current.get(END) != null) {
				if (!EMPTY.equals(word)) {
					String replacements = EMPTY;
					for (int j = 0; j < word.length(); j++) {
						replacements += replacement;
					}
					if (replacement == ' ') {
						i = i - replacements.length();
					}
					section = section.replaceAll(word, replacements.trim());
					word = EMPTY;
				}
				current = null;
			}
		}
		return section;
	}

	/**
	 * 清空敏感词库
	 */
	public static void clear() {
		cache.clear();
	}
}
