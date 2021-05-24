package com.test.Dto;

import java.util.ArrayList;
import java.util.List;

public class Season {
	int id;
	String name;
	List<Episode> episodes = new ArrayList<Episode>();
	
	
	
	
	public Season(int id, String name, List<Episode> episodes) {
		super();
		
		this.episodes = episodes;
	}
	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
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
	

}
