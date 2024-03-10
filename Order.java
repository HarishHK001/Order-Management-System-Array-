package com.shop;

public class Order {
	private final int id;
	private String Productname;
	private double price;
	private double offer;
	private String shopName;
	
	
	public Order(int id, String productname, double price, double offer, String shopName) {
		super();
		this.id = id;
		Productname = productname;
		this.price = price;
		this.offer = offer;
		this.shopName = shopName;
	}


	public String getProductname() {
		return Productname;
	}


	public void setProductname(String productname) {
		Productname = productname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getOffer() {
		return offer;
	}


	public void setOffer(double offer) {
		this.offer = offer;
	}


	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}


	public int getId() {
		return id;
	}
	
	
	
	

}
