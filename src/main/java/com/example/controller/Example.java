package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Example {
	@RequestMapping("/example")
    public String sayHello() {
		return "<h2> Welcome to my website...!!</h2>";
	}


}
