package modulo3;

import org.junit.jupiter.api.Test;
import projeto_biblioteca.Autor;
import projeto_biblioteca.Livro;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    void testLivroGettersESettersEValidador() {

        Autor autor = new Autor("Jess", "Brasileira", false);

        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        // Testa os dados do primeiro livro
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals(autor, livro1.getAutor());
        assertEquals("tecnologia", livro1.getGenero());
        assertTrue(livro1.isDisponivel());

        // Testa os dados do segundo livro
        assertEquals("Java Avançado", livro2.getTitulo());
        assertEquals(autor, livro2.getAutor());
        assertEquals("tecnologia", livro2.getGenero());
        assertFalse(livro2.isDisponivel());

        // Testa a validação quando o livro está indisponível
        livro2.validarDisponibilidade();

        // Altera a disponibilidade do livro
        livro2.setDisponivel(true);
        assertTrue(livro2.isDisponivel());

        // Testa a validação quando os livros estão disponíveis
        livro1.validarDisponibilidade();
        livro2.validarDisponibilidade();
    }
}