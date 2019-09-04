package io.shop.springbootstarter.factory;

import io.shop.springbootstarter.factory.subclass.CoffeeTea;
import io.shop.springbootstarter.factory.subclass.Esan;
import io.shop.springbootstarter.factory.subclass.FastFood;
import io.shop.springbootstarter.factory.subclass.Noodles;
import io.shop.springbootstarter.factory.subclass.RiceBowls;
import io.shop.springbootstarter.factory.subclass.Sweet;

public class FoodFactory {
	public static Food createFood(int id, typeFood type, String name, double price, String national) {
		if(type.equals(typeFood.Noodles)) {
			return new Noodles(id, type, name, price, national);
		}else if(type.equals(typeFood.CoffeeTea)) {
			return new CoffeeTea(id, type, name, price, national);
		}else if(type.equals(typeFood.RiceBowls)) {
			return new RiceBowls(id, type, name, price, national);
		}else if(type.equals(typeFood.Esan)) {
			return new Esan(id, type, name, price, national);
		}else if(type.equals(typeFood.FastFood)) {
			return new FastFood(id, type, name, price, national);
		}else {
			return new Sweet(id, type, name, price, national);
		}
	}
}
