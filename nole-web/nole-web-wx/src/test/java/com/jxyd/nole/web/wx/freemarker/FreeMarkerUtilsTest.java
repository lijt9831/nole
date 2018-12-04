package com.jxyd.nole.web.wx.freemarker;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.jxyd.nole.bas.util.FileUtils;
import com.jxyd.nole.bas.util.StringUtils;

import freemarker.template.Template;
import net.sf.json.JSONObject;

public class FreeMarkerUtilsTest {

//	@Test
//	public void testLoadTemplate() {
//		String dir = System.getProperty("user.dir");
//		Template template = FreeMarkerUtils.loadTemplate(dir + "/src\\test\\java\\com\\jxyd\\nole\\web\\wx\\freemarker\\", "Controller.ftl", "1.0.0");
//		System.out.println(template);
//	}

	@Test
	public void testGenerate() {
		if(2>1)
			return;
		String dir = System.getProperty("user.dir");
		String srcTestJava = dir + "/src/test/java";
		String srcMainJava = dir + "/src/main/java";
		String freemarkerPackage = "com.jxyd.nole.web.wx.freemarker";


		File[] moduleFiles = FileUtils.search("^[\\s\\S]*\\]$", new File("D:\\e\\app\\repo1\\docs\\protocol"));
		
		for (File moduleFile : moduleFiles) {
			Map<String, Object> data = new HashMap<String, Object>();
			String moduleFileName = FileUtils.getNameWithSuffix(moduleFile);
			data.put("moduleDescribe", StringUtils.maxcut(moduleFileName, "", "["));
			data.put("moduleNowDate", new Date());
			String moduleName = StringUtils.maxcut(moduleFileName, "[", "]");
			data.put("moduleName", moduleName);
			System.out.println("---------------");
			File[] jsonFiles = FileUtils.search("[\\s\\S]*\\.json", moduleFile);
			List<JSONObject> methods = new ArrayList<JSONObject>();
			Map<String,Object> method = null;
			int cnt = 0;
			for (File jsonFile : jsonFiles) {
				if(method == null)
					method = new HashMap<String,Object>();
				String jsonFileName = FileUtils.getNameWithSuffix(jsonFile);
				String type = StringUtils.maxcut(jsonFileName, "]", ".json");
				String methodName = StringUtils.maxcut(jsonFileName, "[", "]");
				method.put("path", "/" + moduleName + "/" + methodName);
				method.put("name", methodName);
				method.put("describe", StringUtils.maxcut(jsonFileName, "", "["));
				if(type.equals("请求")){
					method.put("req", JSONObject.fromObject(FileUtils.read(jsonFile, "utf-8")));
				}else{
					method.put("res", JSONObject.fromObject(FileUtils.read(jsonFile, "utf-8")));
				}
				cnt++;
				if(cnt == 2){
					methods.add(JSONObject.fromObject(method));
					method = null;
					cnt = 0;
				}
			}
			
			System.out.println(methods.size());
			data.put("methods", methods);
			String controllerPackage = "com.jxyd.nole.web.wx.controller";
			String servicePackage = "com.jxyd.nole.web.wx.service";
			String serviceImplPackage = "com.jxyd.nole.web.wx.service.impl";
			
			Template Controller = FreeMarkerUtils.loadTemplate(srcTestJava + "/" + freemarkerPackage.replaceAll("\\.", "/") + "/", 
					"Controller.ftl", "1.0.0");
			Template Service = FreeMarkerUtils.loadTemplate(srcTestJava + "/" + freemarkerPackage.replaceAll("\\.", "/") + "/", 
					"Service.ftl", "1.0.0");
			Template ServiceImpl = FreeMarkerUtils.loadTemplate(srcTestJava + "/" + freemarkerPackage.replaceAll("\\.", "/") + "/", 
					"ServiceImpl.ftl", "1.0.0");
			Template Transaction = FreeMarkerUtils.loadTemplate(srcTestJava + "/" + freemarkerPackage.replaceAll("\\.", "/") + "/", 
					"Transaction.ftl", "1.0.0");
			Template TransactionImpl = FreeMarkerUtils.loadTemplate(srcTestJava + "/" + freemarkerPackage.replaceAll("\\.", "/") + "/", 
					"TransactionImpl.ftl", "1.0.0");
			
			FreeMarkerUtils.generate(Controller, data, srcMainJava + "/" +  controllerPackage.replaceAll("\\.", "/")+ "/" + StringUtils.upperCamel(moduleName) + "Controller.java");
//			FreeMarkerUtils.generate(Service, data, srcMainJava + "/" +  servicePackage.replaceAll("\\.", "/")+ "/" + StringUtils.upperCamel(moduleName) + "Service.java");
//			FreeMarkerUtils.generate(ServiceImpl, data, srcMainJava + "/" +  serviceImplPackage.replaceAll("\\.", "/")+ "/" + StringUtils.upperCamel(moduleName) + "ServiceImpl.java");
//			FreeMarkerUtils.generate(Transaction, data, srcMainJava + "/" +  servicePackage.replaceAll("\\.", "/")+ "/" + StringUtils.upperCamel(moduleName) + "Transaction.java");
//			FreeMarkerUtils.generate(TransactionImpl, data, srcMainJava + "/" +  serviceImplPackage.replaceAll("\\.", "/")+ "/" + StringUtils.upperCamel(moduleName) + "TransactionImpl.java");
			
		}
		
	}

	
}
