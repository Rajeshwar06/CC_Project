package com.Display.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DisplayDao {
	String url = "jdbc:mysql://localhost:3306/CC_Project";
	String sql = "Select * From Rajeshwar_111915099_details Where Employee_ID_Number = ? and Password = ?";

	public ArrayList<String> Check(String eid,String pass) {
		ArrayList<String> Student = new ArrayList<>();
		try {  
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println(eid);
            Connection con=DriverManager.getConnection(url,"root","admin");
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1, eid);
            stmt.setString(2, pass);
            System.out.println("hekk");
            
            ResultSet rs = stmt.executeQuery();
//            while(rs.next()) {
//            System.out.println(rs.getString(1));
//            }
            System.out.println("hekkg");
            Student.add(rs.getString(2));
            Student.add(rs.getString(3));
            Student.add(rs.getString(4));
            Student.add(rs.getString(5));
            
	}
	catch(Exception e){
		e.printStackTrace();
	}
		return Student;
	}
}
