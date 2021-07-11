package com.example.highkeen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCntlr {

	public String sayHello() {
		return "Hello YouTube";
	}

}
