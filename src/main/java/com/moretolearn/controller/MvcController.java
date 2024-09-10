package com.moretolearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {

	@GetMapping("/")
	public String defaultPage1(ModelMap model) {
		return "index";
	}
	
	@GetMapping("/ftl")
	public String defaultPage2(ModelMap model) {
		return "ftl-angular";
	}
	
	
}
