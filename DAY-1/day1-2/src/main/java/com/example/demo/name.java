package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
	String str="Keerthanan";
	
	 @GetMapping("/day1-2")
	 public String getName()
	 {
	  return "Welcome "+str+" !";
	 }
}
