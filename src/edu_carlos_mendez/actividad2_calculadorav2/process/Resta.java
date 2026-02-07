package edu_carlos_mendez.actividad2_calculadorav2.process;

/**
 * Clase que implementa la operación de resta, hereda de Operacion.
 */

public class Resta extends Operacion {
    @Override
    public int operar(int op1, int op2) {
        return op1 - op2;
    }
}
