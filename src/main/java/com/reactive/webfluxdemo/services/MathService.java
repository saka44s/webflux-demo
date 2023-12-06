package com.reactive.webfluxdemo.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.reactive.webfluxdemo.dto.Response;
import com.reactive.webfluxdemo.util.SleepUtil;

@Service
public class MathService {
	
	public Response findSquare(int input) {
		return new Response(input * input);
	}
	
	public List<Response> multiplicationTable(int input){
		return IntStream.rangeClosed(1, 10)
				.peek(i -> SleepUtil.sleepSec(1000))
				.peek(i ->  System.out.println("Processing "+i))
				.mapToObj(k -> new Response(k * input))
				.collect(Collectors.toList());
	}
}
