package io.shop.springbootstarter.foodlist;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.shop.springbootstarter.factory.Food;
import io.shop.springbootstarter.factory.FoodFactory;
import io.shop.springbootstarter.factory.typeFood;

@RestController
public class FoodListController {
	
//id, type, name, price, national
	
	@RequestMapping("/foodall")
	public List<Food> getAllFood() {
		return Arrays.asList(
				FoodFactory.createFood(1, typeFood.Noodles, "Ramen", 150.00, "Japan"),
				FoodFactory.createFood(2, typeFood.FastFood, "Burger", 120.00, "USA"),
				FoodFactory.createFood(3, typeFood.Esan, "Somtum", 50.00, "Thai"),
				FoodFactory.createFood(4, typeFood.CoffeeTea, "Iced Tea", 40.00, "Thai"),
				FoodFactory.createFood(5, typeFood.RiceBowls, "Rice with Pig Fired Garlic", 40.00, "Thai"),
				FoodFactory.createFood(6, typeFood.Sweet, "Red Velvet Cake", 105.00, "Japan"),
				FoodFactory.createFood(7, typeFood.FastFood, "Pizza", 180.00, "Italian"),
				FoodFactory.createFood(8, typeFood.Esan, "Larb", 60.00, "Thai")
				
				);
	}
}
