package com.sm.github.HelloWorld;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {

	@GetMapping("/hello")
	public String getMessage(){
		return "Hello ! Welcome to Github Action Demo Project....";
	}
}
