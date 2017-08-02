package com.plataforma.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

import com.plataforma.dao.UsuarioDAO;
import com.plataforma.entidades.Usuario;
import com.plataforma.interfaces.UsuarioLocal;

public class UsuarioBean implements UsuarioLocal {
	
	@PersistenceUnit(name="plataforma")
	private EntityManager em;

	public void listarUsuarios() {
		List<Usuario> lista = new UsuarioDAO(em).listarUsuarios();
		
		
	}

}
