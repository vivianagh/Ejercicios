package com.test;

import java.util.ArrayList;
import java.util.List;

import com.test.Dto.Episode;
import com.test.Dto.Genre;
import com.test.Dto.Movie;
import com.test.Dto.Producto;
import com.test.Dto.Season;
import com.test.Dto.Serie;
import com.test.Dto.User;

public class MockProducto {
	
	//creacion//
			//(int id, String name, Genre genre, String descripcion)
					Genre terror = new Genre(1,"Terror");
					Genre drama = new Genre(2,"Drama");
					Genre comedia = new Genre(3,"Comedia");
					
					Producto peli1 = new Movie(1,"La llamada", terror, "LAlalala");
					Producto peli2 = new Movie(2,"La vida es bella", drama, "LAlalala");
					Producto peli3 = new Movie(3,"Son como niños", comedia, "LAlalala");
					
					Episode episodio1Serie1 = new Episode(1, "capitulo1");
					
					Episode episodio2Serie1 = new Episode(2, "capitulo2");
					List<Episode> episodesSerie1 = new ArrayList<Episode>();
					episodesSerie1.add(episodio1Serie1);
					episodesSerie1.add(episodio2Serie1);
					
					
					// Serie(int id,String name, Genre genre, String description,  	List<Season> seasons)
					Season season1Serie1 = new Season(1,"temporada1",episodesSerie1);
					List<Season> listSeason = new ArrayList<Season>();
					listSeason.add(season1Serie1);
					//  Serie(int id,String name, Genre genre, String description,  	List<Season> seasons)
					Producto serie1 = new Serie(1,"Inocente", drama,"rererere",listSeason);
					
					
			
			///////////////////
			User user = new User(1,"Marcio","123");
			User user2 = new User(2,"Marcia","123");
		

}
