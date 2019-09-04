package io.shop.springbootstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
