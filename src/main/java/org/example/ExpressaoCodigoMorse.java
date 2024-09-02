package org.example;

public class ExpressaoCodigoMorse implements InterpretadorExpressao {
    private String codigoMorse;
    private ContextoCodigoMorse contexto;

    public ExpressaoCodigoMorse(String codigoMorse, ContextoCodigoMorse contexto) {
        this.codigoMorse = codigoMorse;
        this.contexto = contexto;
    }

    @Override
    public String interpretar() {
        return contexto.obterTextoPorCodigoMorse(codigoMorse);
    }
}
