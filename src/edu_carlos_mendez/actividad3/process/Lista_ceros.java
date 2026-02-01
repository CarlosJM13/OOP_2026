package edu_carlos_mendez.actividad3.process;
/**
 * Esta clase se enfoca en todos los codigos enfocados en listas de numeros
 * mover ceros y contar pares
 */
public class Lista_ceros {
        public int[] moverceros ( int[] numeros){
            if (numeros == null) return null;

            int posicion = 0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] != 0) {
                    numeros[posicion] = numeros[i];
                    posicion++;
                }
            }
            while (posicion < numeros.length) {
                numeros[posicion] = 0;
                posicion++;
            }
            return numeros;
        }
        public int contarpares ( int[] numeros){
            int contador = 0;
            for (int n : numeros) {
                if (n % 2 == 0) {
                    contador++;
                }
            }
            return contador;
        }
    }
