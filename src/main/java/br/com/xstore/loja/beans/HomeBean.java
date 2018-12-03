package br.com.xstore.loja.beans;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.xstoredaos.LivroDao;
import br.com.xstoremodels.Livro;

@Model
public class HomeBean {

	@Inject
	private LivroDao dao;
	
	public List<Livro> ultimosLancamentos() {
		return dao.ultimosLancamentos();
	}
	
	public List<Livro> demaisLivros() {
		return dao.demaisLivros();
	}
	
}










