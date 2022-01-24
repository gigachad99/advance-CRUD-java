package com.learncode.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection conn;

	public static Connection getConn() {

		try {
			if (conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learncode", "root", "080499");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
