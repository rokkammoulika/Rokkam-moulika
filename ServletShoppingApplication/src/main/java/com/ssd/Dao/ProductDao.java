package com.ssd.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssd.Dto.CartDto;
import com.ssd.Dto.ProductDto;
import com.ssd.util.dbConnection;



public class ProductDao {

	private Connection con = null;
	private PreparedStatement ps = null;
	private Statement st = null;
	private ResultSet rs = null;
	String Insert_Quarry = "INSERT INTO ssdecom.producttable(ProductName, Category, Price, ProductImage) value(?,?,?,?)";
	String SelectAllData_Quarry = "select * from ssdecom.producttable";
	String SelectByIdOfCartlist = " select * from ssdecom.producttable where Id=?";
	

	public void insertData(ProductDto dto) {
		con = dbConnection.getconnection();
		try {
			ps = con.prepareStatement(Insert_Quarry);
			ps.setString(1, dto.getProductName());
			ps.setString(2, dto.getCategory());
			ps.setDouble(3, dto.getPrice());
			ps.setString(4, dto.getProductImage());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<ProductDto> getAllData() {
		List<ProductDto> productList = new ArrayList<ProductDto>();
		con = dbConnection.getconnection();

		try {
			st = con.createStatement();
			rs = st.executeQuery(SelectAllData_Quarry);
			while (rs.next()) {
				ProductDto dto = new ProductDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5));
				productList.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return productList;
	}

	public List<CartDto> getAllCartProduct(List<CartDto> Cartlist) {
		List<CartDto> list = new ArrayList<CartDto>();
		con = dbConnection.getconnection();

		try {

			for (CartDto newdto : Cartlist) {

				ps = con.prepareStatement(SelectByIdOfCartlist);
				ps.setInt(1, newdto.getId());
				rs = ps.executeQuery();

				CartDto dto = new CartDto();

				while (rs.next()) {
					dto.setId(rs.getInt(1));
					dto.setProductName(rs.getString(2));
					dto.setCategory(rs.getString(3));
					dto.setPrice(rs.getDouble(4));
					dto.setProductImage(rs.getString(5));
					dto.setQuantity(newdto.getQuantity());
					
					list.add(dto);
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}
	
}
