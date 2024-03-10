package com.shop;



public class OrderDB {
	private Order[] ordarr;
	private int index=0;
	private int ordCount=0;
	
	
	public OrderDB(int size) 
	{
		ordarr=new Order[size];
	}
	
	/**
	 * this method is used to add Order details into the Database
	 * @param o e should be Order type
	 * @return Return true if added successfully, else returns false
	 */
	public boolean addOrder(Order o)
	{
		if(index<ordarr.length)
		{
			ordarr[index++]=o;
			System.out.println("Order details added to DB");
			ordCount++;
			return true;
		}
		else
		{
			System.out.println("Databse is full");
			return false;
		}
	}
	
	
	/**
	 * this method prints all the details of the Orders
	 */
	public void viewFullDatabase()
	{
		System.out.println("------------------------------------------------");
		System.out.println("Id\tProductName\tprice\toffer\tshopname");
		System.out.println("----------------------------------------------------------");
		for(Order ord1:ordarr)
		{
			if(ord1 !=null)
			{
				System.out.println(ord1.getId()+"\t"+ord1.getProductname()+"\t"+ord1.getPrice()+"\t"+ord1.getOffer()+"\t"+ord1.getShopName());
			}
		}
	}
	
	/**
	 * this method used to get total order in database
	 * @return return int value representing total order
	 */
	public int getOrderCount()
	{
		return ordCount;
	}
	public Order searchOrder(int id)
	{
		Order o=null;
		for(int i=0;i<ordarr.length;i++)
		{
			if(ordarr[i]!=null && ordarr[i].getId()==id)
			{
				System.out.println("Order found in databse");
				o=ordarr[i];
			}
		}
		if(o==null)
		{
			System.out.println("Order is not found in databse");
		}
		return o;
	}
	
	/**
	 * this method is used to update the price of the order. If Order is found in 
	 * database it will update price of the order by the specified amount
	 * @param  id - order id whoes price to be updated
	 * @param amount - amount to be added to price
	 * @return true - if update is success
	 * 		   false - if update is failed
	 */
	public boolean updatePrice(int id, double amount)
	{
		Order o=searchOrder(id);
		if(o!=null)
		{
			o.setPrice(o.getPrice()+amount);
			System.out.println("Price is updated");
			return true;
		}
		else
		{
			System.out.println("Unable to update, check employee id");
			return false;
		}
	}
	
	/**
	 * this method is used to update the offer of the order. If Order is found in 
	 * database it will update offer of the order by the specified amount
	 * @param id - order id whoes price to be updated
	 * @param offer - offer to be added to price
	 * @return true - if update is success
	 * 		   false - if update is failed 
	 */
	public boolean updateOffer(int id, double offer)
	{
		Order o=searchOrder(id);
		if(o!=null)
		{
			o.setOffer(offer);
			System.out.println("Price is updated");
			return true;
		}
		else
		{
			System.out.println("Unable to update, check employee id");
			return false;
		}
	}
	
	/**
	 *  this method is used to delete order details from database
	 * It deletes the complete order details if the record is found in database
	 * @param id  of the order to be deleted
	 * @return true - id employee is success
	 *         false - id employee is failed
	 */
	public boolean deleteOrder(int id)
	{
		boolean isDeleted=false;
		for(int i=0;i<ordarr.length;i++)
		{
			if(ordarr[i]!=null && ordarr[i].getId()==id)
			{
				ordarr[i]=null;
				System.out.println("Order found in database and deleted");
				isDeleted=true;
				ordCount--;
			}
			
		}
		if(isDeleted==false)
		{
			System.out.println("Order is not found in databse");
		}
		return isDeleted;
	}
	

	

	

	
}
