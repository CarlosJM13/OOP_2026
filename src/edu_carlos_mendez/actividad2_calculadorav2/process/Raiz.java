package edu_carlos_mendez.actividad2_calculadorav2.process;

/**
 * La clase Raiz hereda de Potencia para calcular la raíz n-ésima de un número.
 */

public class Raiz extends Potencia {
    @Override
    public int operar(int indice, int radicando) {
        int i = 1;
        while (true) {
            int pot = super.operar(i, indice);
            if (pot == radicando) return i;
            if (pot > radicando) return i - 1;
            i++;
        }
    }
}
