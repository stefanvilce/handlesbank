package com.vilce.handelsbank.models;

public class Discount {

	private String name;
	private int noPieces;
	private int priceTotal;	
	
	
	
	public Discount(String name, int noPieces, int priceTotal) {
		super();
		this.name = name;
		this.noPieces = noPieces;
		this.priceTotal = priceTotal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoPieces() {
		return noPieces;
	}
	public void setNoPieces(int noPieces) {
		this.noPieces = noPieces;
	}
	public int getPriceTotal() {
		return priceTotal;
	}
	public void setPriceTotal(int priceTotal) {
		this.priceTotal = priceTotal;
	}
	
	
	
}
