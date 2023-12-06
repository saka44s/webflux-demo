package com.reactive.webfluxdemo.services;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.reactive.webfluxdemo.dto.Response;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveMathService {

	public Mono<Response> findSquare(int input) {
		return Mono.fromSupplier(() -> input * input )
				.map(Response::new);
	}
	
	public Flux<Response> multiplicationTable(int input){
		return Flux.range(1, 10)
				//.doOnNext(i -> SleepUtil.sleepSec(1000))
				.delayElements(Duration.ofSeconds(1))
				.doOnNext(i -> System.out.println("Processing React "+ i))
				.map(i -> new Response(input * i));

	}
}
