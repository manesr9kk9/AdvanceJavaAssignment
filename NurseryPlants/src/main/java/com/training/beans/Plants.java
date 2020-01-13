package com.training.beans;

public class Plants {
	private int id;
	private String  name;
	private double price;
	public Plants() {
		super();
	}
	public Plants(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Plants [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
