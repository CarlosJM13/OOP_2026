package edu_carlos_mendez.actividad2_calculadorav2.process;

/**
 * La clase Potencia extiende multiplicacion para implementar la operación de potencia.
 */

public class Potencia extends multiplicacion {
    @Override
    public int operar(int base, int exp) {
        if (exp == 0) return 1;
        int resultado = 1;
        for (int i = 0; i < exp; i++) {
            resultado = super.operar(resultado, base);
        }
        return resultado;
    }
}