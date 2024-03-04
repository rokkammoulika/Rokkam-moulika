package com.ssd.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
	public static void main(String[] args) {

		}
			
			
			public static Connection getconnection() {
				Connection con=null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssdecom","root","root");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
				
			}

}
