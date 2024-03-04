package com.ssd.service;

import java.util.List;

import com.ssd.Dao.OrderDao;
import com.ssd.Dto.OrderDto;



public class OrderService {

private OrderDao dao=new OrderDao();
	
	public void insertData(Integer Id,Integer Quantity,Integer UserId) {
		dao.placeOrder(Id, Quantity,UserId);
	}
	public List<OrderDto> getAllOrders(Integer UserId){
		return dao.getAllOrders(UserId);
	}
}
