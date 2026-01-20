package edu_carlos_mendez.actividad2.calculadora.ui;
import edu_carlos_mendez.actividad2.calculadora.process.*;
import java.util.Scanner;

public class CLI {
    /**
     * CLI se encarga de llamar a todas las clases y poder ejecurar los codigos y poder desplegar la tabla
     * @return tabla y todos los procesos de las clases
     */

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("elige una opción");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. modulo");
        System.out.println("6. potencia");
        System.out.println("7. Raiz");
        System.out.println("8. logaritmo");
        System.out.println("9. salir");
        int opcion = scanner.nextInt();
        int op1 = 0;
        int op2 = 0;
        int op11 = 0;
        int op22 = 0;
        int m1 = 0;
        int m2 = 0;
        int d1 = 0;
        int d2 = 0;
        int mod1 = 0;
        int mod2 = 0;
        int p1 = 0;
        int p2 = 0;
        int r1 = 0;
        int r2 = 0;
        int l1 = 0;
        int l2 = 0;

        switch(opcion){
            case 1:
                //suma
                System.out.println("Ingresa el operando 1");
                op1 = scanner.nextInt();
                System.out.println("Ingresa el operando 2");
                op2 = scanner.nextInt();
                System.out.printf("El resultado %d %s %d es: %d" ,op1,"+",op2, Suma.realizarOperacion(op1,op2));
                break;
            case 2:
                //resta
                System.out.println("Ingresa el operando 1");
                op11 = scanner.nextInt();
                System.out.println("Ingresa el operando 2");
                op22 = scanner.nextInt();
                System.out.printf("El resultado %d %s %d es: %d" ,op11,"+", op22, Resta.realizarOperacion(op11, op22));
                break;
            case 3: // Multiplicacion
                System.out.println("Ingresa el multiplicando:");
                m1 = scanner.nextInt();
                System.out.println("Ingresa el multiplicador:");
                m2 = scanner.nextInt();
                System.out.printf("El resultado es: %d%n", multiplicacion.realizarOperacion(m1, m2));
                break;

            case 4: // Division
                System.out.println("Ingresa el dividendo:");
                d1 = scanner.nextInt();
                System.out.println("Ingresa el divisor:");
                d2 = scanner.nextInt();
                if (d2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                } else {
                    System.out.printf("El resultado es: %d%n", Division.realizarOperacion(d1, d2));
                }
                break;

            case 5: // Modulo
                System.out.println("Ingresa el dividendo:");
                mod1 = scanner.nextInt();
                System.out.println("Ingresa el divisor:");
                mod2 = scanner.nextInt();
                System.out.printf("El residuo es: %d%n", Modulo.realizarOperacion(mod1, mod2));
                break;

            case 6: // Potencia
                System.out.println("Ingresa la base:");
                p1 = scanner.nextInt();
                System.out.println("Ingresa el exponente:");
                p2 = scanner.nextInt();
                System.out.printf("El resultado es: %d%n", Potencia.realizarOperacion(p1, p2));
                break;

            case 7: // Raiz
                System.out.println("Ingresa el grado de la raíz (ej. 2 para cuadrada):");
                r1 = scanner.nextInt();
                System.out.println("Ingresa el número:");
                r2 = scanner.nextInt();
                System.out.printf("La raíz es: %d%n", Raiz.realizarOperacion(r1, r2));
                break;

            case 8: // Logaritmo
                System.out.println("Ingresa la base:");
                l1 = scanner.nextInt();
                System.out.println("Ingresa el argumento:");
                l2 = scanner.nextInt();
                System.out.printf("El logaritmo es: %d%n", Logaritmo.realizarOperacion(l1, l2));
                break;

            case 9: // Salir
                System.out.println("Adiós");
                break;
        }
    }
    }