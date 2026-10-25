package projeto_biblioteca;

import java.util.logging.Logger;

public class EstrategiaPublicacaoLivro implements EstrategiaPublicacao {
    private static final Logger LOGGER = Logger.getLogger(EstrategiaPublicacaoLivro.class.getName());

    @Override
    public void publicar() {
        LOGGER.info("Publicando livro...");
    }
}