package edu_carlos_mendez.actividad2.calculadora.process;

public class multiplicacion{
    /**
     * Este método recibe 2 operandos enteros y devuelve el producto
     * @param op1 multiplicando
     * @param op2 el numero al cual multiplicar
     * @return producto
     */
    public static int realizarOperacion(int op1, int op2) {
        int resultado = 0;
        for (int i = 0; i < op2; i++) {
            resultado = Suma.realizarOperacion(resultado, op1);
        }
        return resultado;
    }
}
