package io.shop.springbootstarter.factory.subclass;

import io.shop.springbootstarter.factory.Food;
import io.shop.springbootstarter.factory.typeFood;

public class Esan extends Food{

	public Esan(int id, typeFood type, String name, double price, String national) {
		super(id, type, name, price, national);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.id;
	}

	@Override
	public typeFood getType() {
		// TODO Auto-generated method stub
		return super.type;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.price;
	}

	@Override
	public String getNational() {
		// TODO Auto-generated method stub
		return super.national;
	}
}
