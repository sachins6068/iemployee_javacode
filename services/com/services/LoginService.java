package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.srcdto.Credentials;

public class LoginService {

	private Connection conn;
	//Credentials creds=new Credentials();
	public String Authenticate(Credentials creds)
	{

	    try {
	        Class.forName(GlobalDetails.driverName).newInstance();
	    } catch (InstantiationException e) {
	        e.printStackTrace();
	    } catch (IllegalAccessException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        System.err.println(e.getMessage() + "------Cannot Load Driver");
	        return null;
	    }

	    try {
	        conn = DriverManager.getConnection(GlobalDetails.conURL, GlobalDetails.user, GlobalDetails.pass);
	    } catch (SQLException e) {
	        System.err.println(e.getMessage() + "--SQL States: " + e.getSQLState() + "---- ErrorCode: " + e.getErrorCode());
	        return null;
	    }
	    try {
	        Statement stm = conn.createStatement();
	        ResultSet rs = stm.executeQuery("SELECT * FROM login");
	        while (rs.next()) {
	        	System.out.print(rs.getString("userid")+" and entered "+creds.getUsername());
	        	System.out.print(rs.getString("password")+" entred by "+creds.getPassword());
	        	if(creds.getPassword().equalsIgnoreCase(rs.getString("password"))&& creds.getUsername().equalsIgnoreCase(rs.getString("userid")))
	        	{
	        	System.out.print(rs.getString("designation")+" result by "+creds.getPassword());
	            return rs.getString("designation");
	        	}
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		return null;
	}

}
