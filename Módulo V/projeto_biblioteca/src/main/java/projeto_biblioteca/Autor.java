package projeto_biblioteca;

public class Autor extends Pessoa implements PublicavelInterface {
    private String nacionalidade;
    private boolean usuario;
    private EstrategiaPublicacao estrategiaPublicacao;

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

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao == null) {
            throw new IllegalStateException("Nenhuma estratégia de publicação foi definida.");
        }

        estrategiaPublicacao.publicar();
    }
}