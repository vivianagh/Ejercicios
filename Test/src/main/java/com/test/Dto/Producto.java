package com.test.Dto;

public abstract class Producto {
	
	int id; 
	String name;
	Genre genre;

	String description;
	
	public Producto() {
	}
	public Producto(int id, String name, Genre genre, String description) {
		
		this.id = id;
		this.name = name;
		this.genre = genre;
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
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
