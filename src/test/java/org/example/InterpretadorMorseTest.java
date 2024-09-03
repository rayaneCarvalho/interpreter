package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterpretadorMorseTest {

    @Test
    void deveTraduzirCodigoMorseParaLetra() {
        DefinicaoCodigoMorse definicao = new DefinicaoCodigoMorse();
        ExpressaoCodigoMorse expressao = new ExpressaoCodigoMorse(".-", definicao); // Código Morse para 'A'
        assertEquals("A", expressao.interpretar());
    }

    @Test
    void deveTraduzirCodigoMorseParaNumero() {
        DefinicaoCodigoMorse definicao = new DefinicaoCodigoMorse();
        ExpressaoCodigoMorse expressao = new ExpressaoCodigoMorse("-----", definicao); // Código Morse para '0'
        assertEquals("0", expressao.interpretar());
    }

    @Test
    void deveTraduzirSentencaCodigoMorse() {
        DefinicaoCodigoMorse definicao = new DefinicaoCodigoMorse();
        InterpretadorCodigoMorse sentenca = new InterpretadorCodigoMorse(".- -... .-.-.-", definicao); // A B .

        assertEquals("AB.", sentenca.interpretar());
    }

    @Test
    void deveRetornarTextoVazioParaCodigoMorseInvalido() {
        DefinicaoCodigoMorse definicao = new DefinicaoCodigoMorse();
        ExpressaoCodigoMorse expressao = new ExpressaoCodigoMorse("????", definicao); // Código Morse inválido
        assertEquals("", expressao.interpretar());
    }

    @Test
    void deveTratarSentencaComCodigoMorseInvalido() {
        DefinicaoCodigoMorse definicao = new DefinicaoCodigoMorse();
        InterpretadorCodigoMorse sentenca = new InterpretadorCodigoMorse(".- ???? -...", definicao); // A Código Morse inválido B

        assertEquals("AB", sentenca.interpretar()); // Apenas 'A' e 'B' devem ser traduzidos, '????' é ignorado
    }
}
