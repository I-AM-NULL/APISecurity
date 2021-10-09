package com.example.BasicAuth.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	
	
	@GetMapping
	public String get()
	{
		System.out.println("Hello Word!");
		
		return "Hello Word!";
	}

}
