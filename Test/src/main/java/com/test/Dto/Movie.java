package com.test.Dto;

import java.util.Date;

public class Movie extends Producto{
	

	Date duration;
	
	public Movie(int id, String name, Genre genre, String description){
		
		super(id,name,genre,description);
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	
	

}
