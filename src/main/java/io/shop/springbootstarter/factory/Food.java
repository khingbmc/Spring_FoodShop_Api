package io.shop.springbootstarter.factory;


public abstract class Food {
	protected int id;
	protected typeFood type;
	protected String name;
	protected double price;
	protected String national;
	
	public abstract int getId();
	
	public abstract typeFood getType();
	
	public abstract String getName();
	
	public abstract double getPrice();
	
	public abstract String getNational();
	
	public Food(int id, typeFood type, String name, double price, String national) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.price = price;
		this.national = national;
	}
	
}

