package modulo3;

import org.junit.jupiter.api.Test;
import projeto_biblioteca.Autor;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testCriacaoEGettersSetters() {
        // Arrange & Act
        Autor autor = new Autor("Alan Turing", "Inglês");

        // Assert - Testando construtor e getters
        assertEquals("Alan Turing", autor.getNome());
        assertEquals("Inglês", autor.getNacionalidade());

        // Act - Testando setters
        autor.setNome("George Orwell");
        autor.setNacionalidade("Britânico");

        // Assert - Verificando se os valores foram atualizados
        assertEquals("George Orwell", autor.getNome());
        assertEquals("Britânico", autor.getNacionalidade());
    }
}