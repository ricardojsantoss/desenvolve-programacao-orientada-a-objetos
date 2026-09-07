package projeto_biblioteca;

import java.time.LocalDateTime;

public class Emprestimo {
    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(LocalDateTime dataRetirada, LocalDateTime dataDevolucao, Livro livro, Usuario usuario) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
    }

    public LocalDateTime getDataRetirada() {
        return dataRetirada;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}