package org.mybatis.generator;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.alibaba.druid.pool.DruidDataSource;
import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.bas.util.StringUtils;
import com.jxyd.nole.jds.mysql.alpha.DataSourceUtils;


public class Generator {

	private static final Log log = LogFactory.getLog(Generator.class);
	
	private static String schema = "ROOT.";
	private static String table_prefix = "nole";
	private static Document doc = null;
	
	private static String javaModelPackage;
	private static String sqlMapPackage;
	private static String javaClientPackage;
	private static String javaModelProject;
	private static String sqlMapProject;
	private static String javaClientProject;
	static {
		try {
			ClassPathResource res = new ClassPathResource("generatorConfig.xml");
			SAXReader saxReader = new SAXReader();
			doc = saxReader.read(res.getInputStream());
			
			javaModelProject = doc.selectSingleNode("//generatorConfiguration/context/javaModelGenerator/@targetProject").getText();
			sqlMapProject = doc.selectSingleNode("//generatorConfiguration/context/sqlMapGenerator/@targetProject").getText();
			javaClientProject = doc.selectSingleNode("//generatorConfiguration/context/javaClientGenerator/@targetProject").getText();

			javaModelPackage = doc.selectSingleNode("//generatorConfiguration/context/javaModelGenerator/@targetPackage").getText();
	        sqlMapPackage = doc.selectSingleNode("//generatorConfiguration/context/sqlMapGenerator/@targetPackage").getText();
	        javaClientPackage = doc.selectSingleNode("//generatorConfiguration/context/javaClientGenerator/@targetPackage").getText();
	       
	        
		} catch (Exception e) {
			log.error("读取 generatorConfig.xml 失败",e);
		}
	}

	public static void main(String[] args) throws Exception {
		log.debug("Start ..");
		
		/* 
		 * -----------------------------------
		 * Basic generate */
		String dir = System.getProperty("user.dir");
		File javaModel = new File(dir + "/" + javaModelProject + "/" + full2path(javaModelPackage));
		log.info(javaModel.getPath());
		if (javaModel.exists()) {
			FileUtils.deleteDirectory(javaModel);
		}
		File javaClient = new File(dir + "/" + javaClientProject + "/" + full2path(javaClientPackage));
		log.info(javaClient.getPath());
		if (javaClient.exists()) {
			FileUtils.deleteDirectory(javaClient);
		}
		File sqlMap = new File(dir + "/" + sqlMapProject + "/" + full2path(sqlMapPackage));
		log.info(sqlMap.getPath());
		if (sqlMap.exists()) {
			FileUtils.deleteDirectory(sqlMap);
		}
		sqlMap.mkdirs();
		
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(null);
		Resource res = new ClassPathResource("generatorConfig.xml");
		Configuration config = cp.parseConfiguration(res.getInputStream());
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);

		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		for (String warning : warnings) {
			log.warn(warning);
		}
		File[] files = com.jxyd.nole.bas.util.FileUtils.search(".xml", sqlMap);
		for (File file : files) {
			String content = FileUtils.readFileToString(file, "utf-8");
			content = content.replaceAll(schema, "");
			FileUtils.writeStringToFile(file, content, "utf-8");
		}
		
		/* 
		 * ----------------------------
		 * Custom generate */
		Properties properties = new Properties();
		properties.load(new ClassPathResource("env/jdbc.properties").getInputStream());
		
		String username = (String)properties.get("mysql_alpha_username");
		String password = (String)properties.get("mysql_alpha_password");
		String url = (String)properties.get("mysql_alpha_url");
		DruidDataSource setup = DataSourceUtils.setup(url, username, password);
		Connection conn = setup.getConnection().getConnection();
		DatabaseMetaData databaseMD = conn.getMetaData();
        ResultSet tableRS = databaseMD.getTables(null, "%", table_prefix + "%", new String[] { "TABLE" });
        while (tableRS.next()) {
			String tableName = tableRS.getString("TABLE_NAME");
			log.info("表：" + tableName);
			ResultSet indexRS = databaseMD.getIndexInfo(null, null, tableName, true, false);
			ResultSet primaryKeysRS = databaseMD.getPrimaryKeys(null, null, tableName);
			String primaryKey = "";
			if (primaryKeysRS.next()) {
				primaryKey = primaryKeysRS.getString("COLUMN_NAME");
				log.info("主键：" + primaryKey);
			}
            Map<String,List<String>> map = new LinkedHashMap<String,List<String>>();
			while (indexRS.next()) {
				boolean unique = !indexRS.getBoolean("NON_UNIQUE");
				String indexName = indexRS.getString("INDEX_NAME");
				String columnName = indexRS.getString("COLUMN_NAME");
				log.info(indexRS.getString("NON_UNIQUE") + "??" + tableName + "??" + indexName);
				if (primaryKey.equals(columnName))
					continue;
				mapIndex(map, indexName + ":" + unique, columnName);
			}
			log.info(map.toString());
            String[] result = locate(tableName);
            String bean = result[0];
            String model = result[1];
            String xmlpath = result[2];
            String client = result[3];
            for (Map.Entry<String,List<String>> entry : map.entrySet()) {
            	boolean unique = Boolean.valueOf(entry.getKey().split(":")[1]);
            	custom(tableName, bean, model, xmlpath, client, entry, false);
            	if(!unique){
            		custom(tableName, bean, model, xmlpath, client, entry, true);
            	}
			}
        }
		log.debug("End [success]");
	}

	private static void custom(String tableName, String bean, String model, String xmlpath, String client,
			Map.Entry<String, List<String>> entry, boolean withRowBounds) {
		// generate java method
		String indexName = entry.getKey().split(":")[0];
		boolean unique = Boolean.valueOf(entry.getKey().split(":")[1]);
		List<String> list = entry.getValue();
		StringBuffer sb = new StringBuffer();
		String returnType = "";
		if(unique){
			returnType = bean;
		}else{
			returnType = "List<" + bean + ">";
		}
		if(withRowBounds){
			sb.append("\n    " + returnType + " selectBy" + StringUtils.upperCamel(indexName) + "WithRowBounds(");
		} else {
			sb.append("\n    " + returnType + " selectBy" + StringUtils.upperCamel(indexName) + "(");
		}
		for (String columnName : list) {
			String lowerCamel = StringUtils.lowerCamel(columnName);
			List<String> read = com.jxyd.nole.bas.util.FileUtils.readLine(new File(model), "utf-8");
			String type = "";
			for (String string : read) {
				if (string.contains(lowerCamel)) {
					type = string.split(" " + lowerCamel + ";")[0].split("private ")[1];
					break;
				}
			}
			sb.append("@Param(\"" + lowerCamel + "\")" + type + " " + lowerCamel + ",");
		}
		if(!unique){
			sb.append("@Param(\"orderByClause\") String orderByClause,");
		}
		String method;
		if(withRowBounds){
			method = sb.append(" RowBounds rowBounds);").toString();
		} else {
			method = sb.substring(0, sb.length() - 1) + ");";
		}
		com.jxyd.nole.bas.util.FileUtils.insertBefore(1, method, new File(client), "utf-8");
		// generate xml sql
		sb = new StringBuffer();
		if(withRowBounds){
			sb.append("  <select id=\"selectBy" + StringUtils.upperCamel(indexName) + "WithRowBounds\" parameterType=\"java.util.Map\" resultMap=\"BaseResultMap\">\n");
		} else {
			sb.append("  <select id=\"selectBy" + StringUtils.upperCamel(indexName) + "\" parameterType=\"java.util.Map\" resultMap=\"BaseResultMap\">\n");
		}
		sb.append("    select * from " + tableName + "\n");
		sb.append("    <where>" + "\n");
		for (String columnName : list) {
			String lowerCamel = StringUtils.lowerCamel(columnName);
			List<String> read = com.jxyd.nole.bas.util.FileUtils.readLine(new File(xmlpath), "utf-8");
			String type = "";
			for (String string : read) {
				if (string.contains("property=\"" + lowerCamel + "\"")) {
					type = string.split("jdbcType=\"")[1].split("\" property=")[0];
					break;
				}
			}
			sb.append("      and `" + columnName + "` = #{" + lowerCamel + ",jdbcType=" + type + "}" + "\n");
		}
		sb.append("    </where>" + "\n");
		if(!unique){
			sb.append("    <if test=\"orderByClause != null\">" + "\n");
			sb.append("      order by ${orderByClause}" + "\n");
			sb.append("    </if>" + "\n");
		}
		sb.append("  </select>");
		String sql = sb.toString();
		com.jxyd.nole.bas.util.FileUtils.insertBefore(1,sql , new File(xmlpath), "utf-8");
	}
	
	private static String[] locate(String name) throws Exception{
		String dir = System.getProperty("user.dir");
		
		String[] result = new String[4];
        String bean = doc.selectSingleNode("//generatorConfiguration/context/table[contains(@tableName,'"+name+"')]/@domainObjectName").getText();
        
        String javaModelPackage = Generator.javaModelPackage + "." + bean + ".java";
        String sqlMapPackage = Generator.sqlMapPackage + "." + bean + "Mapper.xml";
        String javaClientPackage = Generator.javaClientPackage + "." + bean + "Mapper.java";
        
        result[0] = bean;
		result[1] = dir + "/" + javaModelProject + "/" + full2path(javaModelPackage);
		result[2] = dir + "/" + sqlMapProject + "/" + full2path(sqlMapPackage);
		result[3] = dir + "/" + javaClientProject + "/" + full2path(javaClientPackage);
        return result;
	}
	
	private static void mapIndex(Map<String,List<String>> map , String indexName,String columnName){
		if(map == null)
			throw new RuntimeException("map is null");
		if(!map.containsKey(indexName)){
			List<String> list = new ArrayList<String>();
			list.add(columnName);
			map.put(indexName, list);
		}else{
			List<String> list = map.get(indexName);
			list.add(columnName);
		}
	}
	
	private static String full2path(String str) {
		int idx = str.indexOf(".java");
		if(idx > -1){
			str = str.substring(0,idx);
			str = str.replaceAll("\\.", "/") + ".java";
			return str;
		}
		idx = str.indexOf(".xml");
		if(idx > -1){
			str = str.substring(0,idx);
			str = str.replaceAll("\\.", "/") + ".xml";
			return str;
		}
		str = str.replaceAll("\\.", "/");
		return str;
	}
}
