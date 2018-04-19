package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection conn=null;
	
	public static Connection getDbConnection() throws SQLException
	{
		//properties
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "pass");
		return conn;
	}
}