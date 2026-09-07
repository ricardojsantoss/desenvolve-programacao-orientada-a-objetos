package projeto_biblioteca;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main() {
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", false);
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        
        LocalDateTime data = LocalDateTime.of(2024, 5, 8, 23, 37, 21);
        Emprestimo emprestimo = new Emprestimo(data, data, livro, usuario);

        emprestimo.getLivro().validarDisponibilidade();
        LOGGER.info("Livro: " + emprestimo.getLivro().getTitulo());
        LOGGER.info("Autor: " + emprestimo.getLivro().getAutor().getNome());
        LOGGER.info("Genero: " + emprestimo.getLivro().getGenero());
        LOGGER.info("Usuario: " + emprestimo.getUsuario().getNome());
        LOGGER.info("Idade: " + emprestimo.getUsuario().getIdade());
        LOGGER.info("Data de Retirada: " + emprestimo.getDataRetirada());
        LOGGER.info("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}