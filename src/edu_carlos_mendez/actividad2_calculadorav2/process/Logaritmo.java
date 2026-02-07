package edu_carlos_mendez.actividad2_calculadorav2.process;

/**
 * La clase Logaritmo calcula el logaritmo de un número dado una base utilizando la división repetida.
 */

public class Logaritmo extends Division {

    @Override
    public int operar(int base, int argumento) {
        if (base <= 1) return 0;
        int contador = 0;
        int actual = argumento;

        while (actual >= base) {
            actual = super.operar(actual, base);
            contador++;
        }
        return contador;
    }
}
