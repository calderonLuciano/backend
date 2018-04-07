package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {
	/**
	 * Guarda un usuario
	 * @param user
	 * @return El usuario guardado
	 */
	User save(User user);
	
	/**
	 * Metodo que me devuelve la lista de todos los usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();

	/**
	 * Elimina un usuario con el id recibido
	 * @param id
	 */
	void deleteUser(long id);


}
