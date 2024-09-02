package org.example;

import java.util.HashMap;
import java.util.Map;

public class ContextoCodigoMorse {
    private Map<String, String> codigoMorseParaTexto;

    public ContextoCodigoMorse() {
        codigoMorseParaTexto = new HashMap<>();

        codigoMorseParaTexto.put("A", ".-");
        codigoMorseParaTexto.put("B", "-...");
        codigoMorseParaTexto.put("C", "-.-.");
        codigoMorseParaTexto.put("D", "-..");
        codigoMorseParaTexto.put("E", ".");
        codigoMorseParaTexto.put("F", "..-.");
        codigoMorseParaTexto.put("G", "--.");
        codigoMorseParaTexto.put("H", "....");
        codigoMorseParaTexto.put("I", "..");
        codigoMorseParaTexto.put("J", ".---");
        codigoMorseParaTexto.put("K", "-.-");
        codigoMorseParaTexto.put("L", ".-..");
        codigoMorseParaTexto.put("M", "--");
        codigoMorseParaTexto.put("N", "-.");
        codigoMorseParaTexto.put("O", "---");
        codigoMorseParaTexto.put("P", ".--.");
        codigoMorseParaTexto.put("Q", "--.-");
        codigoMorseParaTexto.put("R", ".-.");
        codigoMorseParaTexto.put("S", "...");
        codigoMorseParaTexto.put("T", "-");
        codigoMorseParaTexto.put("U", "..-");
        codigoMorseParaTexto.put("V", "...-");
        codigoMorseParaTexto.put("W", ".--");
        codigoMorseParaTexto.put("X", "-..-");
        codigoMorseParaTexto.put("Y", "-.--");
        codigoMorseParaTexto.put("Z", "--..");
        codigoMorseParaTexto.put("1", ".----");
        codigoMorseParaTexto.put("2", "..---");
        codigoMorseParaTexto.put("3", "...--");
        codigoMorseParaTexto.put("4", "....-");
        codigoMorseParaTexto.put("5", ".....");
        codigoMorseParaTexto.put("6", "-....");
        codigoMorseParaTexto.put("7", "--...");
        codigoMorseParaTexto.put("8", "---..");
        codigoMorseParaTexto.put("9", "----.");
        codigoMorseParaTexto.put("0", "-----");
        codigoMorseParaTexto.put(".", ".-.-.-");
    }

    public String obterTextoPorCodigoMorse(String codigoMorse) {
        for (Map.Entry<String, String> entrada : codigoMorseParaTexto.entrySet()) {
            if (entrada.getValue().equals(codigoMorse)) {
                return entrada.getKey();
            }
        }
        return "";
    }
}

