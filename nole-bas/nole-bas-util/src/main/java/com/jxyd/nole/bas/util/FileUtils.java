package com.jxyd.nole.bas.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtils {
	
    /**
     * 上传时，保存到服务器用 
     *
     * @param fileToServer
     * @param fileFromClient
     * @see org.springframework.web.multipart.MultipartFile.transferTo( File dest)
     */
    public static void save(File fileToServer, File fileFromClient) {
        InputStream in = null;
        OutputStream out = null;
        try {
            byte[] buffer = new byte[4098];
            in = new BufferedInputStream(new FileInputStream(fileFromClient));
            out = new BufferedOutputStream(new FileOutputStream(fileToServer));
            int buffered;
            while ((buffered = in.read(buffer)) != -1) {
                out.write(buffer, 0, buffered);
            }
            out.flush();
        } catch (Exception e) {
            throw new RuntimeException("上传文件错误", e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }
    }
    
	/**
	 * 通过关键词搜索，必须是合法的正则表达式<br>
	 * 
	 * abc.png 可以通过关键字 abc 检索到<br>
	 * 
	 * @param regex
	 * @param inWhichDir
	 * @return
	 */
	public static File[] search(String regex, File inWhichDir) {
		try {
			List<File> matched = new ArrayList<File>();
			Pattern pattern = Pattern.compile(regex);
			list(pattern, inWhichDir, matched);
			return matched.toArray(new File[matched.size()]);
		} catch (Exception e) {
			throw new RuntimeException("搜索失败", e);
		}
	}
	
	// 递归匹配所有符合条件的文件 
	private static void list(Pattern pattern, File inWhichDir, List<File> matched) {
		File[] files = inWhichDir.listFiles();
		for (File file : files) {
			String name = file.getName();
			Matcher matcher = pattern.matcher(name);
			if (matcher.find()) {
				matched.add(file);
			}
			if (file.isDirectory()) {
				list(pattern, file, matched);
			}
		}
	}

	/**
	 * 获取文件名后缀<br>
	 * 例如：test.png 的后缀是 .png
	 * @param file
	 * @return
	 */
	public static String getSuffix(File file) {
		try {
			String name = file.getName();
			String suffix = name.substring(name.lastIndexOf("."));
			return suffix;
		} catch (Exception e) {
			throw new RuntimeException("获取文件名后缀失败", e);
		}
	}
	
	/**
	 * 获取文件名，不带后缀<br>
	 * D://test/img.png <br>
	 * 返回 img
	 * 
	 * @param file
	 * @return
	 */
	public static String getNameWithOutSuffix(File file) {
		try {
			String name = file.getName();
			String suffix = name.substring(0,name.lastIndexOf("."));
			return suffix;
		} catch (Exception e) {
			throw new RuntimeException("获取文件名后缀失败", e);
		}
	}
	
	/**
	 * 获取文件名，带后缀<br>
	 * D://test/img.png <br>
	 * 返回 img.png
	 * @param file
	 * @return
	 */
	public static String getNameWithSuffix(File file) {
		return file.getName();
	}
	
	/**
	 * 获取上级目录地址
	 * D://test/a/b/img.png  <br>
	 * 返回 D://test/a/b <br>
	 * 注：结尾不带 /
	 * 注：文件可以未创建 
	 * @param file
	 * @return
	 */
	public static String getUpper(File file) {
		return file.getParent();
	}
	
	/**
	 * 获取全路径
	 * D://test/a/b/img.png  <br>
	 * 返回 D://test/a/b/img.png
	 * @param file
	 * @return
	 */
	public static String getFull(File file) {
		try {
			// Canonical 美 [kə'nɑnɪkl] 标准
			return file.getCanonicalPath();
		} catch (Exception e) {
			throw new RuntimeException("获取全路径失败", e);
		}
	}
	
	/**
	 * 读取内容<文本形式可以看懂>
	 * 
	 * @param fromWhichFile 从哪个文件读
	 * @param fileCharset 该文件的编码
	 * @return
	 */
	public static String read(File fromWhichFile, String fileCharset) {
		StringBuffer sb = new StringBuffer();
		BufferedReader bufferedReader = null;
		try {
			FileInputStream fis = new FileInputStream(fromWhichFile);
			InputStreamReader isr = new InputStreamReader(fis, fileCharset);
			bufferedReader = new BufferedReader(isr);
			char[] buf = new char[2048];
			int size;
			while ((size = bufferedReader.read(buf)) != -1) {
				sb.append(buf, 0, size);
			}
		} catch (Exception e) {
			throw new RuntimeException("读取文件失败", e);
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
			}
		}
		return sb.toString();
	}
	
	/**
	 * 读取所有行 <文本形式可以看懂>
	 * 
	 * @param fromWhichFile 从哪个文件读
	 * @param fileCharset 该文件的编码
	 * @return
	 */
	public static List<String> readLine(File fromWhichFile, String fileCharset) {
		BufferedReader bufferedReader = null;
		List<String> list = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream(fromWhichFile);
			InputStreamReader isr = new InputStreamReader(fis, fileCharset);
			bufferedReader = new BufferedReader(isr);
			String l;
			while ((l = bufferedReader.readLine()) != null) {
				list.add(l);
			}
		} catch (Exception e) {
			throw new RuntimeException("读取文件失败", e);
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
			}
		}
		return list;
	}
	
	
	/**
	 * @param num 隔几行
	 * @param content 插入行的内容
	 * @param toWhichFile 
	 * @param fileCharset
	 */
	public static void insertBefore(int num, String content, File toWhichFile, String fileCharset) {
		BufferedWriter bw = null;
		try {
			List<String> lines = readLine(toWhichFile,fileCharset);
			int index = lines.size() - num;
			lines.add(index < 0 ? 0 : index, content);
			OutputStream fos = new FileOutputStream(toWhichFile, false);
			OutputStreamWriter osw = new OutputStreamWriter(fos, fileCharset);
			bw = new BufferedWriter(osw);
			for (int i = 0; i < lines.size(); i++) {
				String line = lines.get(i);
				if (i < lines.size() - 1) {
					bw.write(line + "\n");
				} else {
					bw.write(line);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("插入文本失败", e);
		} finally {
			try {
				if (bw != null) {
					bw.flush();
					bw.close();
				}
			} catch (IOException e) {
			}
		}
	}
	
	public static void insertAfter(int num, String content, File toWhichFile, String fileCharset){
		BufferedWriter bw = null;
		try {
			List<String> lines = readLine(toWhichFile,fileCharset);
			int index = num > lines.size()?lines.size():num;
			lines.add(index, content);
			OutputStream fos = new FileOutputStream(toWhichFile, false);
			OutputStreamWriter osw = new OutputStreamWriter(fos, fileCharset);
			bw = new BufferedWriter(osw);
			for (int i = 0; i < lines.size(); i++) {
				String line = lines.get(i);
				if (i < lines.size() - 1) {
					bw.write(line + "\n");
				} else {
					bw.write(line);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("插入文本失败", e);
		} finally {
			try {
				if (bw != null) {
					bw.flush();
					bw.close();
				}
			} catch (IOException e) {
			}
		}
	}
}
