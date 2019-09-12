package io.shop.springbootstarter.foodlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import io.shop.springbootstarter.factory.Food;
import io.shop.springbootstarter.factory.FoodFactory;
import io.shop.springbootstarter.factory.typeFood;

@RestController
public class FoodListController {
	
//id, type, name, price, national
	@RequestMapping("/foodall")
	public List<Food> getAllFood() {
		return FoodFactory.getAllFood();
	}
	
	@PostMapping("/addfood")
	public List<Food> newFood(@RequestParam(value="type", defaultValue="type") String type,
							@RequestParam(value="name", defaultValue="name") String name,
							@RequestParam(value="price", defaultValue="0.00") double price,
							@RequestParam(value="national", defaultValue="national") String national
			) {
//
		return FoodFactory.addFood(type, name, price, national);
	  }
	
	@RequestMapping(value = "/type/{type}", method = RequestMethod.GET)
	public List<Food> getTypeFood(@PathVariable String type) {

		switch (type) {
			case "noodles":{
				return FoodFactory.typeFood(typeFood.Noodles);
			}
			case "ricebowls":{
				return FoodFactory.typeFood(typeFood.RiceBowls);
			}
			case "sweet":{
				return FoodFactory.typeFood(typeFood.Sweet);
			}
			case "esan":{
				return FoodFactory.typeFood(typeFood.Esan);
			}
			case "coffeetea":{
				return FoodFactory.typeFood(typeFood.CoffeeTea);
			}
			case "fastfood":{
				return FoodFactory.typeFood(typeFood.FastFood);
			}
			default:{
				return FoodFactory.typeFood(null);
			}
		}
	}


}
