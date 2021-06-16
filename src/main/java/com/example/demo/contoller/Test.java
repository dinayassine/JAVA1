package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/")
public class Test {
	
	@GetMapping("/")
	public String methode1()
	{
		
		return "Salut a tous";
	}
	
	
	@GetMapping("/test")
	public String methode2()
	{
		
		return "Salut la france";
	}


}
