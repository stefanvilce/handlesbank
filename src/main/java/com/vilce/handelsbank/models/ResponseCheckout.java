package com.vilce.handelsbank.models;

public class ResponseCheckout {
	private Integer price;
	
	
	
	public ResponseCheckout(Integer price) {
		super();
		this.price = price;
	}
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
