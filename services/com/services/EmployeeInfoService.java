package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.srcdto.EmployeeInfo;;

public class EmployeeInfoService {

	private Connection conn;
	int repnum;
	//Credentials creds=new Credentials();
	public void EmpDetails(EmployeeInfo empinfo,String empid)
	{

	    try {
	        Class.forName(GlobalDetails.driverName).newInstance();
	    } catch (InstantiationException e) {
	        e.printStackTrace();
	    } catch (IllegalAccessException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        System.err.println(e.getMessage() + "------Cannot Load Driver");
	        return;
	    }

	    try {
	        conn = DriverManager.getConnection(GlobalDetails.conURL, GlobalDetails.user, GlobalDetails.pass);
	    } catch (SQLException e) {
	        System.err.println(e.getMessage() + "--SQL States: " + e.getSQLState() + "---- ErrorCode: " + e.getErrorCode());
	       return;
	    }
	    try {
	        Statement stm = conn.createStatement();
	        System.out.print("got customer"+empid);
	        ResultSet rs = stm.executeQuery("SELECT * FROM employee WHERE empid like '"+empid+"'");
	        if(rs!=null){
	        	rs.next();
	
	        	System.out.print("got customer"+empid+rs.getString("empid"));
	        	empinfo.setUserid(rs.getString("empid"));
	        	empinfo.setAddress(rs.getString("address"));
	        	empinfo.setCity(rs.getString("city"));
	        	empinfo.setEmploc(rs.getString("emploc"));
	        	empinfo.setEmpmgr(rs.getString("empmgr"));
	        	empinfo.setFname(rs.getString("fname"));
	        	empinfo.setGender(rs.getString("gender"));
	        	empinfo.setHourlypay(rs.getLong("payhour"));
	        	empinfo.setJoindate(rs.getDate("joindate").toString());
	        	empinfo.setLname(rs.getString("lname"));
	        	empinfo.setPhno(rs.getLong("phone"));
	        	empinfo.setSsn(rs.getLong("ssn"));
	        	empinfo.setState(rs.getString("state"));
	        	empinfo.setZip(rs.getInt("zip"));
	        	empinfo.setEmail(rs.getString("email"));
	        	//return;
	        	
	        	rs.close();
	        	
		        return;
	        }
	        else{
	        
	        	return;
	        }
	        
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		return;
	}
}
