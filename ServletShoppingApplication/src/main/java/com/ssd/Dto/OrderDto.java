package com.ssd.Dto;



public class OrderDto extends CartDto{
	
	private Integer OrderId;
	 private Integer UserId;
	private String Date;
	
	public Integer getOrderId() {
		return OrderId;
	}
	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public OrderDto(int id, String productName, String category, Double price, String productImage, Integer quantity,
			Integer orderId, Integer userId, String date) {
		super(id, productName, category, price, productImage, quantity);
		OrderId = orderId;
		UserId = userId;
		Date = date;
	}
	public OrderDto() {
		
	}
	@Override
	public String toString() {
		return "OrderDto [OrderId=" + OrderId + ", UserId=" + UserId + ", Date=" + Date + "]";
	}
	
	
	

}
