package org.xstore.loja.models;

import java.math.BigDecimal;

@Entity
public class Livro {
	
	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer id;

	    private String titulo;
	    @Lob
	    private String descricao;
	    private BigDecimal preco;
	    private Integer numeroPaginas;

	    // getters e setters aqui!

	    @Override
	    public String toString() {
	        return "Livro [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", preco=" + getPreco() + ", numeroPaginas="
	                + getNumeroPaginas() + "]";
	    }

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public Integer getNumeroPaginas() {
			return numeroPaginas;
		}

		public void setNumeroPaginas(Integer numeroPaginas) {
			this.numeroPaginas = numeroPaginas;
		}
}
