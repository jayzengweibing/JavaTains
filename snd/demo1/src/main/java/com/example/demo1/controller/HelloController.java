package com.example.demo1.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller("/hello")
public class HelloController {

	@RequestMapping("/")
	public String index(){
		return "hi";
	}
}