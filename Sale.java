package com.java_lessons.newjdbc;

public class Sale {

	private String productQty; 
	private int productPrice;
	private String date;
	private String productName;
	private int productId;
	String getproductQty() {
		return productQty;
		}
	int getproductId() {
		return productId;
		}
	int getproductPrice() {
		return productPrice;
		}
	String getproductName() {
		return productName;
		}
	String getproductdate() {
		return date;
		}
	void setproductQty(String productQty) {
		this.productQty=productQty;
	}
	void setproductPrice(int productPrice) {
		this.productPrice=productPrice;
	}
	void setproductId(int productId) {
		this.productId=productId;
	}
	void setproductName(String productName) {
		this.productName=productName;
	}
	void setproductdate(String productdate) {
		this.date=productdate;
	}
	
	
	
	
	
	
}
