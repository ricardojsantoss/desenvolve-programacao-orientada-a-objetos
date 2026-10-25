package projeto_biblioteca;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", false);
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

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

        LOGGER.info("Artigo: " + artigo.getTitulo());
        LOGGER.info("Autor do artigo: " + artigo.getAutor().getNome());
        LOGGER.info("Genero do artigo: " + artigo.getGenero());
        LOGGER.info("Publicado: " + artigo.isPublicado());

        LOGGER.info("=== Testando o padrão Strategy ===");

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        LOGGER.info("Selecionando estratégia de publicação de livro.");
        autor.publicar();

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        LOGGER.info("Trocando para a estratégia de publicação de artigo.");
        autor.publicar();
    }
}