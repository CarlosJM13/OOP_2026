package edu_carlos_mendez.actividad2.calculadora.process;

public class Potencia {
    /**
     * Este método calcula la potencia de un número utilizando suceciones de multiplicación
     * @param op1 base
     * @param op2 exponente
     * @return el resultado de elevar la base al exponente
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op2 == 0) return 1;

        int resultado = 1;
        for (int i = 0; i < op2; i++) {
            resultado = multiplicacion.realizarOperacion(resultado, op1);
        }
        return resultado;
    }
}
