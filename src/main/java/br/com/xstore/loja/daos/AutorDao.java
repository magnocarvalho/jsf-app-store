package br.com.xstore.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.xstore.loja.models.Autor;

public class AutorDao {

	@PersistenceContext
	private EntityManager manager;

	public List<Autor> listar() {
		return manager.createQuery(
				"select a from Autor a", Autor.class)
				.getResultList();
	}
	
}






