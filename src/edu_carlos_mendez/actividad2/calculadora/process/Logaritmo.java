package edu_carlos_mendez.actividad2.calculadora.process;

public class Logaritmo {
    /**
     * Este método calcula el logaritmo entero de un número en una base logarítmica con divisiones sucesivas
     * @param op1 base del log
     * @param op2 numero del log
     * @return el exponente
     */

    public static int realizarOperacion(int op1, int op2) {
        if (op1 <= 1) return 0;

        int contador = 0;
        int actual = op2;

        while (actual >= op1) {
            actual = Division.realizarOperacion(actual, op1);
            contador = Suma.realizarOperacion(contador, 1);
        }

        return contador;
    }
}

//editado para poder hacerlo con divisiones sucesivas. Error: se ejecutaba con multiplicaciones
