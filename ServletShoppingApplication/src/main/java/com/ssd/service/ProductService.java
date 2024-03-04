package com.ssd.service;

import java.util.List;

import com.ssd.Dao.ProductDao;
import com.ssd.Dto.CartDto;
import com.ssd.Dto.ProductDto;


public class ProductService {

	public ProductDao dao;
	public ProductService(ProductDao dao) {
		super();
		this.dao = dao;
	}
	public ProductService() {
		super();
	}
	public void insertData(ProductDto dto) {
		dao.insertData(dto);
	}
	public List<ProductDto> getAllData(){
		return dao.getAllData();
	}
	public List<CartDto> getAllCartProduct(List<CartDto> Cartlist){
		return dao.getAllCartProduct(Cartlist);
		
	}
}
