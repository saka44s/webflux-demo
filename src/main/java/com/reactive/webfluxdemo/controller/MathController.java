package com.reactive.webfluxdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactive.webfluxdemo.dto.Response;
import com.reactive.webfluxdemo.services.MathService;

@RestController
@RequestMapping("math")
public class MathController {
	
	@Autowired
	public MathService mathService;
	
	
	@GetMapping("square/{val}")
	public Response findSquare(@PathVariable int val) {
		return mathService.findSquare(val);
	}
	
	@GetMapping("table/{val}")
	public List<Response> multiply(@PathVariable int val) {
		return mathService.multiplicationTable(val);
	}
	
	
	

}
