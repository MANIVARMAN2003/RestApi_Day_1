package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Color {
	@GetMapping("day13")
	public String Color()
	{
		String a = "Blue";
		return"My favourite color is " + a;
	}
}
