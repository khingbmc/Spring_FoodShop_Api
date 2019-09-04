package io.shop.springbootstarter.foodlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.shop.springbootstarter.factory.Food;
import io.shop.springbootstarter.factory.FoodFactory;
import io.shop.springbootstarter.factory.typeFood;

@RestController
public class FoodListController {
	
//id, type, name, price, national
	private static List<Food> allFood = new ArrayList<Food>();
	static {
			allFood.add(FoodFactory.createFood(1, typeFood.Noodles, "Ramen", 150.00, "Japan"));
			allFood.add(FoodFactory.createFood(2, typeFood.FastFood, "Burger", 120.00, "USA"));
			allFood.add(FoodFactory.createFood(3, typeFood.Esan, "Somtum", 50.00, "Thai"));
			allFood.add(FoodFactory.createFood(4, typeFood.CoffeeTea, "Iced Tea", 40.00, "Thai"));
			allFood.add(FoodFactory.createFood(5, typeFood.RiceBowls, "Rice with Pig Fired Garlic", 40.00, "Thai"));
			allFood.add(FoodFactory.createFood(6, typeFood.Sweet, "Red Velvet Cake", 105.00, "Japan"));
			allFood.add(FoodFactory.createFood(7, typeFood.FastFood, "Pizza", 180.00, "Italian"));
			allFood.add(FoodFactory.createFood(8, typeFood.Esan, "Larb", 60.00, "Thai"));
			
			};
	@RequestMapping("/foodall")
	public List<Food> getAllFood() {
		return this.allFood;
	}
	
	@PostMapping("/addfood")
	public List<Food> newFood(@RequestParam(value="type", defaultValue="type") String type,
							@RequestParam(value="name", defaultValue="name") String name,
							@RequestParam(value="price", defaultValue="0.00") double price,
							@RequestParam(value="national", defaultValue="national") String national
			) {
		
		int count = this.allFood.size();
		count++;
		typeFood typefood = typeFood.Noodles;
		if(type.equals("noodles")) {
			typefood = typeFood.Noodles;
		}else if (type.equals("coffeetea")) {
			typefood = typeFood.CoffeeTea;
		}else if (type.equals("esan")) {
			typefood = typeFood.Esan;
		}else if (type.equals("fastfood")) {
			typefood = typeFood.FastFood;
		}else if (type.equals("ricebowls")) {
			typefood = typeFood.RiceBowls;
		}else {
			typefood = typeFood.Sweet;
		}
	
		this.allFood.add(FoodFactory.createFood(count, typefood, name, price, national));
		return this.allFood;
	  }
	
	@RequestMapping("/type/{type}")
	public List<Food> getTypeFood(@PathVariable String type) {
		switch (type) {
			case "noodles":{
				return getarrayType(typeFood.Noodles);
			}
			case "ricebowls":{
				return getarrayType(typeFood.RiceBowls);
			}
			case "sweet":{
				return getarrayType(typeFood.Sweet);
			}
			case "esan":{
				return getarrayType(typeFood.Esan);
			}
			case "coffeetea":{
				return getarrayType(typeFood.CoffeeTea);
			}
			case "fastfood":{
				return getarrayType(typeFood.FastFood);
			}
			default:{
				return getarrayType(null);
			}
		}
	}
	private List<Food> getarrayType(typeFood type){
		List<Food> require = new ArrayList<Food>();
		for(Food item : getAllFood()) {
			if(item.getType() == type) {
				require.add(item);
			}
		}
		return require;
	}
}
