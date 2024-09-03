package org.example;

public class ExpressaoCodigoMorse implements InterpretadorExpressao {
    private String codigoMorse;
    private DefinicaoCodigoMorse definicao;

    public ExpressaoCodigoMorse(String codigoMorse, DefinicaoCodigoMorse definicao) {
        this.codigoMorse = codigoMorse;
        this.definicao = definicao;
    }

    @Override
    public String interpretar() {
        return definicao.obterTextoPorCodigoMorse(codigoMorse);
    }
}

