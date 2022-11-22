package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indicou que a classe e controladora do tipo rest
@RequestMapping("/")  //endereco que definimos
public class HelloController {
	
	//metodo para devolver a mensagem
	
	
	@GetMapping
	public String hello () {
		return " <h1>Hello Meli </h1> ";
	}

	
	@GetMapping("/2")
	public String hello2 () {
		return "Hello Will";
	}

	
	
}
