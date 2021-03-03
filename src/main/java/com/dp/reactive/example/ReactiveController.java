package com.dp.reactive.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReactiveController {
	
	@GetMapping("/single")
	public String returnString() {
		return "Hello";
	}
}
