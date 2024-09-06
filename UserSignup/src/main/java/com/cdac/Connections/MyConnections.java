package com.cdac.Connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnections {


	private Connection con =null;
	private String DBURL = "jdbc:mysql://localhost:3306/demouser";
	private String DBUSER ="root";
	private String DBPASS ="";
	
	public Connection config() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
