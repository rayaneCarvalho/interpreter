package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterpretadorMorseTest {

    @Test
    void deveTraduzirCodigoMorseParaLetra() {
        ContextoCodigoMorse contexto = new ContextoCodigoMorse();
        ExpressaoCodigoMorse expressao = new ExpressaoCodigoMorse(".-", contexto); // Código Morse para 'A'
        assertEquals("A", expressao.interpretar());
    }

    @Test
    void deveTraduzirCodigoMorseParaNumero() {
        ContextoCodigoMorse contexto = new ContextoCodigoMorse();
        ExpressaoCodigoMorse expressao = new ExpressaoCodigoMorse("-----", contexto); // Código Morse para '0'
        assertEquals("0", expressao.interpretar());
    }

    @Test
    void deveTraduzirSentencaCodigoMorse() {
        ContextoCodigoMorse contexto = new ContextoCodigoMorse();
        SentencaCodigoMorse sentenca = new SentencaCodigoMorse();
        sentenca.adicionarExpressao(new ExpressaoCodigoMorse(".-", contexto)); // A
        sentenca.adicionarExpressao(new ExpressaoCodigoMorse("-...", contexto)); // B
        sentenca.adicionarExpressao(new ExpressaoCodigoMorse(".-.-.-", contexto)); // .

        assertEquals("AB.", sentenca.interpretar());
    }

    @Test
    void deveRetornarTextoVazioParaCodigoMorseInvalido() {
        ContextoCodigoMorse contexto = new ContextoCodigoMorse();
        ExpressaoCodigoMorse expressao = new ExpressaoCodigoMorse("????", contexto); // Código Morse inválido
        assertEquals("", expressao.interpretar());
    }

    @Test
    void deveTratarSentencaComCodigoMorseInvalido() {
        ContextoCodigoMorse contexto = new ContextoCodigoMorse();
        SentencaCodigoMorse sentenca = new SentencaCodigoMorse();
        sentenca.adicionarExpressao(new ExpressaoCodigoMorse(".-", contexto)); // A
        sentenca.adicionarExpressao(new ExpressaoCodigoMorse("????", contexto)); // Código Morse inválido

        assertEquals("A", sentenca.interpretar()); // Apenas 'A' deve ser traduzido, '????' é ignorado
    }
}
