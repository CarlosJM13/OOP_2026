package edu_carlos_mendez.actividad2_calculadorav2.process;

public class multiplicacion extends Suma {
    @Override
    public int operar(int op1, int op2) {
        int resultado = 0;
        for (int i = 0; i < op2; i++) {
            resultado = super.operar(resultado, op1);
        }
        return resultado;
    }
}