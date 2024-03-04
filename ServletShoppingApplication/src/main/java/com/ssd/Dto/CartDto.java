package com.ssd.Dto;



public class CartDto extends ProductDto {
	
	private Integer Quantity;

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public CartDto(int id, String productName, String category, Double price, String productImage, Integer quantity) {
		super(id, productName, category, price, productImage);
		Quantity = quantity;
	}
	public CartDto() {
		
	}

	@Override
	public String toString() {
		return "CartDto [Quantity=" + Quantity + "]";
	}

	

}
