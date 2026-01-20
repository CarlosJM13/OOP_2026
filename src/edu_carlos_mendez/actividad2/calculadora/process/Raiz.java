package edu_carlos_mendez.actividad2.calculadora.process;

public class Raiz {
    /**
     * Este método calcula la raíz entera
     * @param op1 numero de raiz
     * @param op2 radicando, numero que se sacara su raiz
     * @return la raíz entera
     */
    public static int realizarOperacion(int op1, int op2) {
        int i = 1;
        while (true) {
            int potencia = Potencia.realizarOperacion(i, op1);
            if (potencia == op2) {
                return i;
            } else if (potencia > op2) {
                return i - 1;
            }
            i++;
        }
    }
}
