package edu_carlos_mendez.actividad2.calculadora.process;

public class Logaritmo {
    /**
     * Este método calcula el logaritmo entero de un número en una base logarítmica
     * @param op1 base del log
     * @param op2 numero del log
     * @return el exponente
     */
    public static int realizarOperacion(int op1, int op2) {
        int exponente = 0;
        int valorActual = 1;

        while (valorActual < op2) {
            valorActual = multiplicacion.realizarOperacion(valorActual, op1);
            exponente++;
        }

        if (valorActual > op2) {
            return exponente - 1;
        }
        return exponente;
    }
}