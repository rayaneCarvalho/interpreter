package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorCodigoMorse implements InterpretadorExpressao {

    private InterpretadorExpressao interpretadorInicial;

    public InterpretadorCodigoMorse(String contexto, DefinicaoCodigoMorse definicao) {

        Stack<InterpretadorExpressao> pilhaInterpretadores = new Stack<>();
        List<String> elementos = Arrays.asList(contexto.split(" "));
        Iterator<String> iterator = elementos.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            ExpressaoCodigoMorse interpretador = new ExpressaoCodigoMorse(elemento, definicao);
            pilhaInterpretadores.push(interpretador);
        }

        StringBuilder resultado = new StringBuilder();
        while (!pilhaInterpretadores.isEmpty()) {
            resultado.insert(0, pilhaInterpretadores.pop().interpretar());
        }

        interpretadorInicial = new TextoInterpretado(resultado.toString());
    }

    @Override
    public String interpretar() {
        return interpretadorInicial.interpretar();
    }
}

