package br.com.xstore.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.xstore.loja.models.Usuario;

public class UsuarioDao {

	@PersistenceContext
	private EntityManager manager;

	public void salvar(Usuario usuario) {
		manager.persist(usuario);
	}
	
}
