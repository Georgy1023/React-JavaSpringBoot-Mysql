package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {
	@Id
	private int id;
	private String name;
	private String description;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
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
	
	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	public Professor() {
		super();
	}
	public Professor(String name,String description) {
		this.name = name;
		this.description = description;
	}
}