package com.jxyd.nole.web.wx.property;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import com.jxyd.nole.bas.util.FileUtils;
import com.jxyd.nole.bas.util.StringUtils;
import com.jxyd.nole.web.wx.freemarker.FreeMarkerUtils;

import freemarker.template.Template;

public class PropertiesGenerator {

	@Test
	public void generate() throws IOException {
		String dir = System.getProperty("user.dir");
		String srcTestJava = dir + "/src/test/java";
		String srcMainJava = dir + "/src/main/java";
		String pack = "com.jxyd.nole.web.wx.property";
		Template template = FreeMarkerUtils.loadTemplate(srcTestJava + "/" + pack.replaceAll("\\.", "/") + "/", 
				"DemoProperties.ftl", "1.0.0");
		
		Map<String, Object> data = new HashMap<String,Object>();
		String res = "env/common.properties";
		ClassPathResource classPathResource = new ClassPathResource(res);
		
		String filename = classPathResource.getFilename();
		data.put("pack", pack);
		data.put("date", new Date());
		data.put("filename", StringUtils.upperCamel(filename));
		data.put("ref", filename.split("\\.")[0]);
		data.put("res", res);
		data.put("sharp", "#");
		List<Map<String,String>> entryList = new ArrayList<Map<String,String>>();
		List<String> lines = FileUtils.readLine(classPathResource.getFile(), "utf-8");
		String comment = "\t/**\n";
		boolean hasComment = false;
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			if(StringUtils.isBlank(line))
				continue;
			if(line.startsWith("#")) {
				comment += "\t *" + StringUtils.unicodeToString(line.substring(1)) + "\n";
				hasComment = true;
			}else {
				comment += "\t */";
				int indexOf = line.indexOf("=");
				String key = line.substring(0,indexOf).trim();
				String value = line.substring(indexOf+1).trim();
				Map<String,String> map = new HashMap<String,String>();
				if(value.equals("false") || value.equals("true")) {
					map.put("type", "boolean");
				}else {
					map.put("type", "String");
				}
				map.put("comment", hasComment?comment:"");
				map.put("key", key);
				map.put("keyCons", StringUtils.lowerCamel(key));
				entryList.add(map);
				System.out.println(comment);
				comment = "\t/**\n";
				hasComment = false;
			}
			
		}
		data.put("properties", entryList);
		FreeMarkerUtils.generate(template, data, srcMainJava + "/" +  pack.replaceAll("\\.", "/")+ "/" + StringUtils.upperCamel(filename) + ".java");
	}
	
}
