package com.jxyd.nole.jds.mysql.alpha;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

public class DataSourceUtils {

	public static DruidDataSource setup(String url, String username, String password) {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}

	public static void main(String[] args) throws SQLException {
		DruidDataSource setup = setup("jdbc:mysql://139.199.97.176:3306/nole_dev?useSSL=false","root","mNp678rx<+");
		DruidPooledConnection conn = setup.getConnection();
        Statement stmt = null;
        ResultSet rset = null;
		try {
            stmt = conn.createStatement();
            rset = stmt.executeQuery("select 1 + 1;");
            if(rset.next()) {
            	int int1 = rset.getInt(1);
            	System.out.println(int1);
            }
        } finally {
             try { if (rset != null) rset.close(); } catch(Exception e) { }
             try { if (stmt != null) stmt.close(); } catch(Exception e) { }
             try { if (conn != null) conn.close(); } catch(Exception e) { }
        }
	}
}
