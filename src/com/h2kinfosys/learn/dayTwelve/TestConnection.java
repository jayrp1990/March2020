package com.h2kinfosys.learn.dayTwelve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class TestConnection {

	public static Connection getConnection() throws SQLException {
		String connectionURL = "jdbc:mysql://localhost:3306/sakila";
	
		Connection conn = null;
		try {
			// 1. Driver  -  Driver msqlDriver = new Driver();
			// 2. DriverManager - DriverManager.registerDriver(msqlDriver);
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "password");
			
			// 3. Making a connection
			conn = DriverManager.getConnection(connectionURL, props);
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void main(String[] args) throws SQLException {
		Connection conn = TestConnection.getConnection();
		System.out.println(conn);
		conn.close();
	}

}
