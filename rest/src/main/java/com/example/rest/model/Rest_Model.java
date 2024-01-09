package com.example.rest.model;


public class Rest_Model {

	private int itemid;
	private String itemname;
	private double itemprice;
	private int itemqty;
	
	public Rest_Model(int itemid, String itemname, double itemprice, int itemqty) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.itemqty = itemqty;
	}

	public Rest_Model() {
	
		
		}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getItemprice() {
		return itemprice;
	}

	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}

	public int getItemqty() {
		return itemqty;
	}

	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}
	
}
