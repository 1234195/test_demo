package com.example.demo.Q6;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
	
	@RequestMapping("/add/{m}/{n}")
	public int addition(@PathVariable(name="m") int m, @PathVariable(name="n") int n) {
		int p=m+n;
		return p;
	}
	
	@RequestMapping("/sub/{m}/{n}")
	public int substraction(@PathVariable(name="m") int m, @PathVariable(name="n") int n) {
		int p=m-n;
		return p;
	}
	
	@RequestMapping("/mul/{m}/{n}")
	public int multiplication(@PathVariable(name="m") int m, @PathVariable(name="n") int n) {
		int p=m*n;
		return p;
	}
	
	@RequestMapping("/div/{m}/{n}")
	public int division(@PathVariable(name="m") int m, @PathVariable(name="n") int n) {
		int p=m/n;
		return p;
	}
}
