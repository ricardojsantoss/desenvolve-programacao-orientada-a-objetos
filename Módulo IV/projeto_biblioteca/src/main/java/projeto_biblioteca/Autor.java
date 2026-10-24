package projeto_biblioteca;

public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean usuario;

    public Autor(String nome, String nacionalidade, boolean usuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.usuario = usuario;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean isUsuario() {
        return usuario;
    }

    public void setUsuario(boolean usuario) {
        this.usuario = usuario;
    }
}