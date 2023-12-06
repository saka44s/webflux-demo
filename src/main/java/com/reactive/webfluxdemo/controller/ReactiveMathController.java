package com.reactive.webfluxdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactive.webfluxdemo.dto.Response;
import com.reactive.webfluxdemo.services.ReactiveMathService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("reactmath")
public class ReactiveMathController {
	
	@Autowired
	public ReactiveMathService mathService;
	
	
	@GetMapping("square/{val}")
	public Mono<Response> findSquare(@PathVariable int val) {
		return this.mathService.findSquare(val);
	}
	
	@GetMapping("table/{val}")
	public Flux<Response> multiply(@PathVariable int val) {
		return this.mathService.multiplicationTable(val);
	}
	
	@GetMapping(value = "table/{val}/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Response> multiplyStream(@PathVariable int val) {
		return this.mathService.multiplicationTable(val);
	}
	
	
	

}
