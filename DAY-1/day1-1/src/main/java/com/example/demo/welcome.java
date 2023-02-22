package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
@RequestMapping("day1-1")
public String display() {
	return "Welcome to Springboot";
}
}
