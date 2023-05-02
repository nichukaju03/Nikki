package com.book2.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="story_details")
 
 public class Story2 {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String authorname;
private int noOfPages;
public int getId() {
		return id;
	}
public void setId(int id) {
	this.id = id;
	}
public String getAuthorname() {
	return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
}
