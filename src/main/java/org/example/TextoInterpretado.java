package org.example;

public class TextoInterpretado implements InterpretadorExpressao {
    private String texto;

    public TextoInterpretado(String texto) {
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        return texto;
    }
}


