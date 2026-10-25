package projeto_biblioteca;

import java.util.logging.Logger;

public class Livro {
    private static final Logger LOGGER = Logger.getLogger(Livro.class.getName());

    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void validarDisponibilidade() {
        if (!disponivel) {
            LOGGER.warning("O livro não está disponível");
        }
    }
}