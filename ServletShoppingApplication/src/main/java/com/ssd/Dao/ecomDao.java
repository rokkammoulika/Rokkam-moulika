package com.ssd.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ssd.Dto.ecomDto;
import com.ssd.util.dbConnection;



public class ecomDao {

	private Connection con=null;
	private PreparedStatement pre=null;
	private ResultSet rs=null;
	
	String Insert_Quarry="INSERT INTO ssdecom.ssdecomtable (Name,Email,PhoneNo,AdharNo,Password) value(?,?,?,?,?)";
	String getByEmailPassword_Quarry="select * from ssdecom.ssdecomtable where Email=? and Password=?";
	public void insertUserData(ecomDto dto) {
		
		con=dbConnection.getconnection();
		try {
			pre=con.prepareStatement(Insert_Quarry);
			pre.setString(1, dto.getName());;
			pre.setString(2, dto.getEmail());
			pre.setString(3, dto.getPhoneNo());
			pre.setString(4, dto.getAdharNo());
			pre.setString(5, dto.getPassword());
			pre.executeUpdate(); 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ecomDto isLogin(String Email, String Password) {
		con=dbConnection.getconnection();
		ecomDto dto=new ecomDto()  ;
		try {
			pre=con.prepareStatement(getByEmailPassword_Quarry);
			pre.setString(1, Email);
			pre.setString(2, Password);
		    rs=	pre.executeQuery();
		    while(rs.next()) {
		    	dto.setUserId(rs.getInt(1));
		    	dto.setName(rs.getString(2));
		    	
		    }
		    
	   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
}
