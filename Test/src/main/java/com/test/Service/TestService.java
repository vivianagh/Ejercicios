package com.test.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.test.Dto.Genre;
import com.test.Dto.Producto;
import com.test.Dto.User;
import com.test.Dto.UserHasProduct;

public class TestService {
	
	//buscar(genero, nombre) -> lista<Producto>
	public List<Producto> findByGenreOrName(Genre genre, String name, List<Producto> allProductos){
		List<Producto> list = new ArrayList<Producto>();
		if(genre.getName() != null && name != null)
			list = allProductos.stream().filter(x-> x.getGenre().getName().equals(genre.getName()) || x.getName().equals(name)).collect(Collectors.toList());
		else if(genre.getName() != null){
			list = allProductos.stream().filter(x -> x.getGenre().getName().equals(genre.getName())).collect(Collectors.toList());
		}
		else
			list = allProductos.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());		
		return list;
	}
	
	//seleccionarProducto(idUsuario, id) -> Producto
	public UserHasProduct seleccionarProducto(int userId, int productoId, List<UserHasProduct> uhpList, List<Producto> allProductos, List<User> userList){
		Producto producto = findProductoById(productoId,allProductos);
		User user = findUserById(userId,userList);
		UserHasProduct uhp = new UserHasProduct(user, producto,0);
		uhpList.add(uhp);
		
		return uhp;
	}
	
	public Producto findProductoById(int id,List<Producto> allProductos){
		Producto p =  (Producto) allProductos.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
		return p;
		
	}
	
	public User findUserById(int userId, List<User> userList){
		User user = (User) userList.stream().filter(x -> x.getId() == userId).collect(Collectors.toList());
		return user;
	}
	
	//puntuarProducto(id,score) -> ok    (1,10)
	public void puntuarProducto( int userHasProductId ,int score ,List<UserHasProduct> uhpList){
		UserHasProduct uhp = (UserHasProduct) uhpList.stream().filter(x -> x.getId() == userHasProductId).collect(Collectors.toList());
		
		uhp.setScore(score);
		
	}
	

}
