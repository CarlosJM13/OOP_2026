package edu_carlos_mendez.actividad2_calculadorav2.process;

/**
 * Clase que implementa la operación de suma, hereda de Operacion.
 */

public class Suma extends Operacion {
    @Override
    public int operar(int op1, int op2) {
        return op1 + op2;
    }
}