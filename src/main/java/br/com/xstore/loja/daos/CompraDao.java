package br.com.xstore.loja.daos;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.xstoremodels.Compra;

public class CompraDao implements Serializable {

	private static final long serialVersionUID = -7499464687101467281L;

	@PersistenceContext
	private EntityManager manager;

	public void salvar(Compra compra) {
		manager.persist(compra);
	}

	public Compra buscaPorUuid(String uuid) {
		return manager.createQuery("select c from Compra c where c.uuid = :uuid", Compra.class)
				.setParameter("uuid", uuid).getSingleResult();
	}
}
