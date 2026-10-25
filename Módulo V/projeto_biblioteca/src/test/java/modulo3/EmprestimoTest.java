package modulo3;

import org.junit.jupiter.api.Test;
import projeto_biblioteca.Autor;
import projeto_biblioteca.Emprestimo;
import projeto_biblioteca.Livro;
import projeto_biblioteca.Usuario;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {

    @Test
    void testEmprestimoGetters() {

        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro(
                "Java Basics",
                new Autor("Alan Turing", "Inglês", false),
                "Tecnologia",
                true
        );

        Usuario usuario = new Usuario("Gabriel", 21);

        LocalDateTime ldtRetirada = dataRetirada.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        LocalDateTime ldtDevolucao = dataDevolucao.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        Emprestimo emprestimo = new Emprestimo(
                ldtRetirada,
                ldtDevolucao,
                livro,
                usuario
        );

        // Verifica as datas do empréstimo
        assertEquals(ldtRetirada, emprestimo.getDataRetirada());
        assertEquals(ldtDevolucao, emprestimo.getDataDevolucao());

        // Verifica o livro associado ao empréstimo
        assertEquals(livro, emprestimo.getLivro());
        assertEquals("Java Basics", emprestimo.getLivro().getTitulo());

        // Verifica o usuário associado ao empréstimo
        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals("Gabriel", emprestimo.getUsuario().getNome());
        assertEquals(21, emprestimo.getUsuario().getIdade());
    }
}