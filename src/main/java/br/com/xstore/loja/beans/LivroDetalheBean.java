package br.com.xstore.loja.beans;

import javax.ejb.Stateful;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
xstore
import br.com.xstoredaos.LivroDao;
import br.com.xstore.loja.models.Livro;

@Model
public class LivroDetalheBean {

	@Inject
	private LivroDao dao;
	
	private Livro livro;
	
	private Integer id;
	
	public void carregaDetalhe() {
		this.livro = dao.buscarPorId(id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}








