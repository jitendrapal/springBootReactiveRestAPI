package com.example.appconsumer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping(value = "/process", method = RequestMethod.GET)
	public Mono<MessageDetails> getMessage() {
		Mono<MessageDetails> data = Mono.just(new MessageDetails("RSS", "20-04-2010"));
		
		//MessageDetails messageDetails = new MessageDetails("RSS", "20-04-2010");
		System.out.println("client");
		return  data;
	}

}
