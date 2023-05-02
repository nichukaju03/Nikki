package com.book2.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="book_details")
public class Book2 {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private  int id;
private String name;
private int price;
@OneToOne(targetEntity = Story2.class,cascade =CascadeType.ALL)
@JoinColumn(name="book_id", referencedColumnName = "id")
private Story2 stories;
 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Story2 getStories() {
		return stories;
	}
	public void setStories(Story2 stories) {
		this.stories = stories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
