package org.xstore.loja.daos;

import javax.persistente.EntityManager;

import org.xstore.loja.models.Livro;

import javax.persistence.PersistenceContext;

public class LivroDao {

    @PersistenceContext
    private EntityManager manager;
    
    public void salvar(Livro livro) {
        manager.persist(livro);
    }
}
