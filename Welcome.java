package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Welcome {
	@GetMapping("day11")
	public String welcome()
	{
		return"Welcome String Boot";
	}

}
