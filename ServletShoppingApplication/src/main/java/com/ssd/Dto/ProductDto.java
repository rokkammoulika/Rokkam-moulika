package com.ssd.Dto;

public class ProductDto {

	private int Id;
	private String ProductName;
	private String Category;
	private Double Price;
	private String ProductImage;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getProductImage() {
		return ProductImage;
	}
	public void setProductImage(String productImage) {
		ProductImage = productImage;
	}
	public ProductDto(int id, String productName, String category, Double price, String productImage) {
		super();
		Id = id;
		ProductName = productName;
		Category = category;
		Price = price;
		ProductImage = productImage;
	}
	public ProductDto() {
		super();
	}
	@Override
	public String toString() {
		return "ProductDto [Id=" + Id + ", ProductName=" + ProductName + ", Category=" + Category + ", Price=" + Price
				+ ", ProductImage=" + ProductImage + "]";
	}
	
	

}
