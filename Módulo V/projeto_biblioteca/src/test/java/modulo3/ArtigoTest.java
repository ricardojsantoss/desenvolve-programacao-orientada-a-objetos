package modulo3;

import org.junit.jupiter.api.Test;
import projeto_biblioteca.Artigo;
import projeto_biblioteca.Autor;

import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    void testCriacaoEGetters() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}