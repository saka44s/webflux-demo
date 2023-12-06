package com.reactive.webfluxdemo.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Response {
	private Date dt = new Date();
	private int output;
	
	public Response(int output) {
		this.output = output;
	}
}
