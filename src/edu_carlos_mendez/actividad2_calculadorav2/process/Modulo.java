package edu_carlos_mendez.actividad2_calculadorav2.process;

/**
 * La clase Modulo hereda de Resta para calcular el residuo de una división utilizando restas sucesivas.
 */

public class Modulo extends Resta {
    @Override
    public int operar(int dividendo, int divisor) {
        int residuo = dividendo;
        while (residuo >= divisor) {
            residuo = super.operar(residuo, divisor);
        }
        return residuo;
    }
}