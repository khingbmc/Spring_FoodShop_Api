package io.shop.springbootstarter.foodlist;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodListController {
	
	@RequestMapping("/foodall")
	public List<Food> getAllFood() {
		return Arrays.asList(
				new Food("tomyum", "tomyumkung", "tomyum description"),
				new Food("mama", "mamatomyumkung", "mama tomyum description"),
				new Food("omlet", "omlet", "omlet description")
				);
	}
}
