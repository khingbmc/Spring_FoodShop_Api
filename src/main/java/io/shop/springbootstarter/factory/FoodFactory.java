package io.shop.springbootstarter.factory;

import io.shop.springbootstarter.factory.subclass.CoffeeTea;
import io.shop.springbootstarter.factory.subclass.Esan;
import io.shop.springbootstarter.factory.subclass.FastFood;
import io.shop.springbootstarter.factory.subclass.Noodles;
import io.shop.springbootstarter.factory.subclass.RiceBowls;
import io.shop.springbootstarter.factory.subclass.Sweet;
import io.shop.springbootstarter.foodlist.FileSysSingle;

import java.util.ArrayList;
import java.util.List;

public class FoodFactory {

	public static List<Food> createFoods = new ArrayList<Food>();
	public static FileSysSingle file;
	static{
		file = FileSysSingle.getInstance();
		createFoods = file.fileLoad();
	};

	public static List<Food> getAllFood(){
		return file.fileLoad();
	}

	public static List<Food> typeFood(typeFood type){
		List<Food> query = new ArrayList<Food>();
		for(Food food : file.fileLoad()){
			if(food.getType() == type){
				query.add(food);
			}
		}
		return query;
	}

	public static List<Food> addFood(String type, String name, double price, String national){
		int count = file.fileLoad().size();
		count++;
		createFoods.add(FoodFactory.createFood(count, type, name, price, national));
		file.saveFile(createFoods);
		return file.fileLoad();


	}

	public static Food createFood(int id, String type, String name, double price, String national){
		if(type.equals("noodles")) {
			return new Noodles(id, typeFood.Noodles, name, price, national);
		}else if (type.equals("coffeetea")) {
			return new CoffeeTea(id, typeFood.CoffeeTea, name, price, national);
		}else if (type.equals("esan")) {
			return new Esan(id, typeFood.Esan, name, price, national);
		}else if (type.equals("fastfood")) {
			return new FastFood(id, typeFood.FastFood, name, price, national);
		}else if (type.equals("ricebowls")) {
			return new RiceBowls(id, typeFood.RiceBowls, name, price, national);
		}else {
			return new Sweet(id, typeFood.Sweet, name, price, national);
		}
	}
}
