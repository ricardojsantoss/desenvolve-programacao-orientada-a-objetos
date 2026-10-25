package modulo3;

import org.junit.jupiter.api.Test;
import projeto_biblioteca.Autor;
import projeto_biblioteca.EstrategiaPublicacaoArtigo;
import projeto_biblioteca.EstrategiaPublicacaoLivro;

import static org.junit.jupiter.api.Assertions.*;

public class EstrategiaPublicacaoTest {

    @Test
    void devePublicarComEstrategiaDeLivro() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());

        assertDoesNotThrow(autor::publicar);
    }

    @Test
    void devePublicarComEstrategiaDeArtigo() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());

        assertDoesNotThrow(autor::publicar);
    }

    @Test
    void devePermitirTrocarEstrategiaEmTempoDeExecucao() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        assertDoesNotThrow(autor::publicar);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        assertDoesNotThrow(autor::publicar);
    }

    @Test
    void deveLancarExcecaoQuandoEstrategiaNaoForDefinida() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);

        assertThrows(IllegalStateException.class, autor::publicar);
    }
}