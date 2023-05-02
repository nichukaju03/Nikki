package com.book2.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.book2.Entity.Book2;
import com.book2.repository.Book2Repository;

@Repository

public class Book2Dao {
	@Autowired
	Book2Repository br;
	public String setAll(Book2 a) {	
		br.save(a);
		return "SaveAll";
	}
	public List<Book2> getAllObj() {
		return br.findAll();

	}

}
