package edu_carlos_mendez.actividad2.calculadora.process;

public class Division {
    /**
     * Este método recibe 2 operandos enteros y devuelve la división entera
     * @param op1 dividendo
     * @param op2 divisor
     * @return el cociente de op1 / op2
     */
    public static int realizarOperacion(int op1, int op2) {
        int cociente = 0;
        int valoracumulado = op1;


        while (valoracumulado >= op2) {
            valoracumulado = Resta.realizarOperacion(valoracumulado, op2);
            cociente++;
        }
        return cociente;
    }
}