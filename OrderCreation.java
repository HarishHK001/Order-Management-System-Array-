package com.shop;

public class OrderCreation {
	private static int random=1001;
	
	public Order createOrder(String Productname, double price, double offer, String shopName)
	{
		Order o=new Order(random++, Productname, price, offer, shopName);
		
		return o;
	}

}
