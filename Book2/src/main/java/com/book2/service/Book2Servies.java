package com.book2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book2.Dao.Book2Dao;
import com.book2.Entity.Book2;

@Service
public class Book2Servies {
	@Autowired
	Book2Dao bd;

	public String setAll(Book2 a) {
		return bd.setAll(a);
	}

	public List<Book2> getAllObj() {
		return bd.getAllObj();
	}

}
