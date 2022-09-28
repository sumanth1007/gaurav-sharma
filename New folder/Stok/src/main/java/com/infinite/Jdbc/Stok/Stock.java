package com.infinite.Jdbc.Stok;

public class Stock {
	
	private String stockid;
	private String itemName;
	private double price;
	private int QuantityAvail;
	@Override
	public String toString() {
		return "stock [stockid=" + stockid + ", itemName=" + itemName + ", price=" + price + ", QuantityAvail="
				+ QuantityAvail + "]";
	}
	public Stock(String stockid, String itemName, double price, int quantityAvail) {
		super();
		this.stockid = stockid;
		this.itemName = itemName;
		this.price = price;
		QuantityAvail = quantityAvail;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return QuantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		QuantityAvail = quantityAvail;
	}
	

}
