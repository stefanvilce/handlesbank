package com.vilce.handelsbank.models;

public class Watch {
	private String id;
	private String name;
	private Integer price;
	private Discount discount;
	
	public Watch(String id, String name, Integer price, Discount discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	
}
