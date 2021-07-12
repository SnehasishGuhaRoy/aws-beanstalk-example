package com.example.highkeen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloCntlr {

	@GetMapping("/api/hello")
	public String sayHello() {
		return "Hello to the AWS World";
	}

}
