package com.book2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.book2.Entity.Book2;
import com.book2.service.Book2Servies;

@RestController
public class Book2Controller {
	
	@Autowired
	Book2Servies bs;
	@PostMapping(value="/setAllObj")
	public String setAll(@RequestBody Book2 a ) {
		return bs.setAll(a);
	}
	
	@GetMapping(value = "/getAllObj")
	public List<Book2> getAllObj() {
		return bs.getAllObj();
	}
	@GetMapping("/name")
    public String name() {
    	return "viki";
    }

}
