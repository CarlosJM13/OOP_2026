package edu_carlos_mendez.actividad2.calculadora.process;

public class Modulo {
    /**
     * Este método recibe 2 operandos enteros y devuelve el residuo de la división
     * @param op1 dividendo
     * @param op2 divisor
     * @return residuo contrario a la division con solo el residuo y no un punto decimal
     */
    public static int realizarOperacion(int op1, int op2) {
        int residuo = op1;

        while (residuo >= op2) {
            residuo = Resta.realizarOperacion(residuo, op2);
        }
        return residuo;
    }
}
