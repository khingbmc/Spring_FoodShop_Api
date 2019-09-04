package io.shop.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShopApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ShopApiApp.class, args);
	}
	
	@RequestMapping("/")
	String Home() {
		return "<h1>Welcome to Food Restuarant</h1><br>localhost:8080/foodall => watch all foodss<br>";
	}

}
 