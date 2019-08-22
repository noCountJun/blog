package org.anse.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectionTest {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	//연결문자열 jdbc:oracle:thin:@호스트:포트:sid
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER = "system";	
	private static final String PW = "123qweQWE";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		
		try( Connection conn = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("연결성공");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
