package com.shop;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("\t\t\tMain start\n");
		
		OrderCreation oc=new OrderCreation();
		
		Order o1=oc.createOrder("car", 50.3, 10, "HK shop");
		Order o2=oc.createOrder("bus", 60.3, 10, "HK shop");
		Order o3=oc.createOrder("Train", 200.3, 15, "HK shop");
		Order o4=oc.createOrder("gun", 100.3, 10, "HK shop");
		Order o5=oc.createOrder("plane", 300.3, 20, "HK shop");
		
		OrderDB oDB=new OrderDB(10);
		
		oDB.addOrder(o1);
		oDB.addOrder(o2);
		oDB.addOrder(o3);
		oDB.addOrder(o4);
		oDB.addOrder(o5);
		
		System.out.println("\ntotal Order:"+oDB.getOrderCount());
		
		oDB.viewFullDatabase();
		
		
		Order o=oDB.searchOrder(1005);
		System.out.println("name "+o.getProductname()+", price "+o.getPrice()+"\n");
		
		oDB.updatePrice(1004, 1000);
		oDB.updateOffer(1004, 50);
		oDB.viewFullDatabase();
		
		
		oDB.deleteOrder(1005);
		oDB.viewFullDatabase();
		
		
		
		System.out.println("\ntotal Order:"+oDB.getOrderCount());
		
		
		System.out.println("\t\t\t main end");
		
	}

}
