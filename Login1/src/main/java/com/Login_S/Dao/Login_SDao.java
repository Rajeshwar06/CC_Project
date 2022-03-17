package com.Login_S.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login_SDao {
	String url = "jdbc:mysql://localhost:3306/CC_Project";
	String sql = "Select * From Rajeshwar_111915099_Details Where Employee_ID_Number = ? and Password = ?";
public boolean check(String eid, String pass) {
		
		
		try {  
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("Hello World");
	            Connection con=DriverManager.getConnection(url,"root","admin");
	            PreparedStatement stmt=con.prepareStatement(sql);
	            stmt.setString(1, eid);
	            stmt.setString(2, pass);
	            ResultSet rs = stmt.executeQuery();
	           // System.out.println(rs.getString(1));
	            if(rs.next()) {
	            	return true;
	            }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
		 
		 return false;
	
	}
}
