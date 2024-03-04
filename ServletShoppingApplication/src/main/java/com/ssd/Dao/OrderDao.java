package com.ssd.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ssd.Dto.OrderDto;
import com.ssd.util.dbConnection;


public class OrderDao {

	
	private Connection con = null;
	private PreparedStatement ps = null;
	private Statement st = null;
	private ResultSet rs = null;
	String Insert_Quarry = "INSERT INTO ssdecom.ordertable(Id, ProductName, Date, Quantity, ProductImage,UserId) value(?,?,?,?,?,?)";
	
	String SelectByIdOfCartlist = " select * from ssdecom.producttable where Id=?";
	String SelectAllData_Quarry = "select * from ssdecom.ordertable where UserId=?";
	
	

	public void placeOrder(Integer Id,Integer Quantity,Integer UserId) {

		con = dbConnection.getconnection();
		OrderDto dto = new OrderDto();
		try {
			
		
			
			ps = con.prepareStatement(SelectByIdOfCartlist);
			ps.setInt(1, Id);
			rs = ps.executeQuery();
			
			while(rs.next()) {
			
			ps = con.prepareStatement(Insert_Quarry);
			
			ps.setInt(1, Id);
			ps.setString(2,rs.getString(2));
			ps.setString(3,LocalDateTime.now().toString());
			ps.setInt(4, Quantity);
			ps.setString(5,rs.getString(5));
			ps.setInt(6, UserId);
			
			int noOfRecors = ps.executeUpdate();
			}
			} catch (Exception e) {
			// TODO: handle exception
				
				e.printStackTrace();
		}

	}
	
	
	public List<OrderDto> getAllOrders(Integer UserId){
		List<OrderDto> list=new ArrayList<OrderDto>();
		
		con = dbConnection.getconnection();

		try {
			 ps= con.prepareStatement(SelectAllData_Quarry);
			 ps.setInt(1, UserId);
			rs = ps.executeQuery();
			while (rs.next()) {
				OrderDto dto = new OrderDto();
                 dto.setOrderId(rs.getInt(1));
                 dto.setId(rs.getInt(2));
                 dto.setProductName(rs.getString(3));
                 dto.setQuantity(rs.getInt(4));
                 dto.setDate(rs.getString(5));
               
                 dto.setProductImage(rs.getString(6));
                 dto.setUserId(rs.getInt(7));
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
