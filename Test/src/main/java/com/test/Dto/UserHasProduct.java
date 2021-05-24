package com.test.Dto;

public class UserHasProduct {
	
	int id;
	private User user;
	private Producto producto;
	int score;
	
	
	
	public UserHasProduct(User user, Producto producto, int score) {
		
		this.user = user;
		this.producto = producto;
		this.score = score;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

}
