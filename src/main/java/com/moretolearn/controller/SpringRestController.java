package com.moretolearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class SpringRestController {

	@GetMapping("data")
	public String getData() {
		return "OK";
	}
}
