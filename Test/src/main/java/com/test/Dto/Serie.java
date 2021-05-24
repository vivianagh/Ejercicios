package com.test.Dto;

import java.util.List;

public class Serie extends Producto{
	
	List<Season> seasons;
	
	public Serie(int id,String name, Genre genre, String description,  	List<Season> seasons) {
		super(id,name, genre, description);
		
		this.seasons = seasons;
	}



	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

}
