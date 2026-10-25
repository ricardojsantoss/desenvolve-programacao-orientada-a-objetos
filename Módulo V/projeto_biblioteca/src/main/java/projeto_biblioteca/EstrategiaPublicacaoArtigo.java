package projeto_biblioteca;

import java.util.logging.Logger;

public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao {
    private static final Logger LOGGER = Logger.getLogger(EstrategiaPublicacaoArtigo.class.getName());

    @Override
    public void publicar() {
        LOGGER.info("Publicando artigo...");
    }
}