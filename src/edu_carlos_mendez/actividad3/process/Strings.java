package edu_carlos_mendez.actividad3.process;
/**
 * Esta clase se enfoca en todos los codigos enfocados en cadenas de texto
 * palindromos, contar vocales, invertir cadenas, etc.
 */

public class Strings {
    public boolean palindromo(String texto) {
        if (texto == null) {
            return false;
        }
        String invertida = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertida);

    }
    public int contarvocales(String texto) {
        if (texto == null) {
            return 0;
        }
        int contador = 0;
        String vocales = "a,e,i,o,u";

        for (char c : texto.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
    public String invertircadena(String texto) {
        if (texto == null) return null;

        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }
    public int ubicacion_caracter(String texto, char objetivo) {
        if (texto == null) return -1;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == objetivo) {
                return i;
            }
        }
        return -1;
    }
}
