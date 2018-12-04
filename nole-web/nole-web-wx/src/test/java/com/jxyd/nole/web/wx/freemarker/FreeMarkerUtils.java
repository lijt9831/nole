package com.jxyd.nole.web.wx.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

public class FreeMarkerUtils {

	public static Template loadTemplate(String inWhichDir, String whichFtl, String version) {
		try {
			if (version == null)
				version = "1.0.0";
			Version v = new Version(version);
			Configuration conf = new Configuration(v);
			conf.setEncoding(Locale.CHINA, "utf-8");
			conf.setDirectoryForTemplateLoading(new File(inWhichDir));
			return conf.getTemplate(whichFtl);
		} catch (Exception e) {
			throw new RuntimeException("获取模板失败", e);
		}
	}

	public static void generate(Template ftl, Map<String, Object> data, String target) {
		FileWriter out = null;
		try {
			out = new FileWriter(target);
			ftl.process(data, out);
		} catch (Exception e) {
			throw new RuntimeException("生成文件失败", e);
		} finally {
			try {
				if(out != null)out.close();
			} catch (IOException ignore) {
			}
		}
	}
}
