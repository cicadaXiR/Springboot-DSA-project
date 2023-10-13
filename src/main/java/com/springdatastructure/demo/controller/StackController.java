package com.springdatastructure.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdatastructure.demo.dto.StackRequestDto;
import com.springdatastructure.demo.service.StackService;

@RestController
@RequestMapping("/stack")
@CrossOrigin("http://localhost:3000/")
public class StackController {
	
	@Autowired
	private StackService service;
	
	@PostMapping("/push")
	public void push(@RequestBody StackRequestDto stackRequestDto) {
		service.push(stackRequestDto);
	}
	
	@DeleteMapping("/pop")
	public String pop() {
		return service.pop();
	}
	
	@GetMapping("/peek")
	public String peek() {
		return service.peek();
	}
	
	@GetMapping("/isEmpty")
	public boolean isEmpty() {
		return service.isEmpty();
	}
	
	@GetMapping("/size")
	public int size() {
		return service.size();
	}
}
