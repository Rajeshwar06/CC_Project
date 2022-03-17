package com.SignUp.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SignUpDao {
	String url = "jdbc:mysql://localhost:3306/CC_Project";
	
	public void check(String Eid,String pass,String fname,String lname,String dob,String contact){
	try {  
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Hello World");
        Connection con=DriverManager.getConnection(url,"root","admin");
        System.out.println(pass);
        String sql = "insert into Rajeshwar_111915099_details values('"+Eid+"','"+fname+"','"+lname+"','"+dob+"','"+contact+"','"+pass+"')";
        //System.out.println(uname);
        PreparedStatement stmt=con.prepareStatement(sql);
        
        stmt.executeUpdate();
       
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
