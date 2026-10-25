package modulo3;

import org.junit.jupiter.api.Test;
import projeto_biblioteca.Usuario;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testCriacaoEGettersSetters() {
        // Arrange & Act
        Usuario usuario = new Usuario("Gabriel", 21);

        // Assert - Testando construtor e getters
        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());

        // Act - Testando setters
        usuario.setNome("Lucas Rafael");
        usuario.setIdade(25);

        // Assert - Verificando se os valores foram atualizados
        assertEquals("Lucas Rafael", usuario.getNome());
        assertEquals(25, usuario.getIdade());
    }
}