package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchLead {
	
	String test_1 = null;
	String test_2_3 = null;
	String test_4

	@RequestMapping("/searchleads")
	public String searchLead() {
		return "search_lead";			
	}
}
