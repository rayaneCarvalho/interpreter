package org.example;

import java.util.ArrayList;
import java.util.List;

public class SentencaCodigoMorse implements InterpretadorExpressao {
    private List<ExpressaoCodigoMorse> expressoes;

    public SentencaCodigoMorse() {
        expressoes = new ArrayList<>();
    }

    public void adicionarExpressao(ExpressaoCodigoMorse expressao) {
        expressoes.add(expressao);
    }

    @Override
    public String interpretar() {
        StringBuilder resultado = new StringBuilder();
        for (ExpressaoCodigoMorse expressao : expressoes) {
            resultado.append(expressao.interpretar());
        }
        return resultado.toString();
    }
}

