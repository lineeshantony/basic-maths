package org.lineesh.basicmaths.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicMathsController {

	@GetMapping(value = "/add/{number1}/{number2}")
	public int add(@PathVariable int number1, @PathVariable int number2) {
		return number1 + number2;
	}

	@GetMapping(value = "/multiply/{number1}/{number2}")
	public int multiply(@PathVariable int number1, @PathVariable int number2) {
		return number1 * number2;
	}

	@GetMapping(value = "/subtract/{number1}/{number2}")
	public int subtract(@PathVariable int number1, @PathVariable int number2) {
		return number1 - number2;
	}

	@GetMapping(value = "/divide/{number1}/{number2}")
	public int divide(@PathVariable int number1, @PathVariable int number2) {
		return number1 / number2;
	}
	
	@RequestMapping("/")  
    public String hello(){  
        return"Hello!";  
    }  
}
