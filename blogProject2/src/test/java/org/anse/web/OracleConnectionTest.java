package org.anse.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectionTest {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	//���Ṯ�ڿ� jdbc:oracle:thin:@ȣ��Ʈ:��Ʈ:sid
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER = "system";	
	private static final String PW = "123qweQWE";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		
		try( Connection conn = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("���Ἲ��");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
