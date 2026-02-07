package edu_carlos_mendez.actividad2_calculadorav2.process;

/**
 * La clase Division implementa la operación de división utilizando restas sucesivas.
 */

public class Division extends Resta {
    @Override
    public int operar(int dividendo, int divisor) {
        int cociente = 0;
        int acumulado = dividendo;
        while (acumulado >= divisor) {
            acumulado = super.operar(acumulado, divisor);
            cociente++;
        }
        return cociente;
    }
}
