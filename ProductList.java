package com.payme.payme.model;

import java.time.LocalDateTime;

public class ProductList {
	   private Long productId; 
	   private String productname;
	   private int productcode;
	   private int price;
	   private String quantity;
	   private String color;
	   private int instock;
	   private LocalDateTime date;
	   


	public ProductList() {
		super();
	}
	public ProductList( Long productId, 
						String productname, 
						int productcode, 
						int price, 
						String quantity,
						String color,
						int instock, 
						LocalDateTime date) {
		super();
		
		this.productId = productId;
		this.productname = productname;
		this.productcode = productcode;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
		this.instock = instock;
		this.date = date;
		
	}
	public ProductList(String productname, 
						int productcode, 
						int price, 
						String quantity, 
						String color, 
						int instock,
						LocalDateTime date) {
		super();
		
		this.productname = productname;
		this.productcode = productcode;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
		this.instock = instock;
		this.date = date;
	}


	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductcode() {
		return productcode;
	}
	public void setProductcode(int productcode) {
		this.productcode = productcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getinstock() {
		return instock;
	}
	public void setinstock(int instock) {
		this.instock = instock;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
