package org.xstore.loja.beans;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.xstore.loja.models.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {

    private Livro livro = new Livro();

    public void salva() {
        System.out.println("Livro cadastrado: " + livro);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
