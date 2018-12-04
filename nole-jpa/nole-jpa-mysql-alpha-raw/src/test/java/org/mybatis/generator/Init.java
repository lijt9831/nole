package org.mybatis.generator;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

import com.alibaba.druid.pool.DruidDataSource;
import com.jxyd.nole.bas.util.FileUtils;
import com.jxyd.nole.bas.util.StringUtils;
import com.jxyd.nole.jds.mysql.alpha.DataSourceUtils;

public class Init {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.load(new ClassPathResource("env/jdbc.properties").getInputStream());
		
		String username = (String)properties.get("mysql_alpha_username");
		String password = (String)properties.get("mysql_alpha_password");
		String url = (String)properties.get("mysql_alpha_url");
		DruidDataSource setup = DataSourceUtils.setup(url, username, password);
		Connection conn = setup.getConnection().getConnection();
		DatabaseMetaData databaseMD = conn.getMetaData();
        ResultSet tableRS = databaseMD.getTables(null, "%", "nole%", new String[] { "TABLE" });
        
        String dir = System.getProperty("user.dir");
        File file = new File(dir + "/src/test/resources/generatorConfig.xml");
        while (tableRS.next()) {
        	String tableName = tableRS.getString("TABLE_NAME");
        	StringBuffer sb = new StringBuffer();
			sb.append("    <table tableName=\"" + tableName + "\" domainObjectName=\"" + StringUtils.upperCamel(tableName) + "\" schema=\"root\" delimitAllColumns=\"true\">\n");
			String id = tableName.split("_")[0] + "_id";
			sb.append("    <generatedKey column=\"" + id + "\" sqlStatement=\"MySql\" identity=\"true\" />\n");
			sb.append("    <columnRenamingRule searchString=\"" + id + "\" replaceString=\"id\"/></table>\n");
        	
        	FileUtils.insertBefore(2, sb.toString(), file, "utf-8");
        }
	}
}
