package edu_carlos_mendez.actividad2_calculadorav2.ui;
import edu_carlos_mendez.actividad2_calculadorav2.process.*;
import java.util.Scanner;

public class CLI {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        Operacion operacion = null;

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");
        System.out.println("7. Raiz");
        System.out.println("8. Logaritmo");
        System.out.println("Elige una opción:");
        int opcion = scanner.nextInt();

        switch(opcion) {
            case 1: operacion = new Suma(); break;
            case 2: operacion = new Resta(); break;
            case 3: operacion = new multiplicacion(); break;
            case 4: operacion = new Division(); break;
            case 5: operacion = new Modulo(); break;
            case 6: operacion = new Potencia(); break;
            case 7: operacion = new Raiz(); break;
            case 8: operacion = new Logaritmo(); break;
            default: System.out.println("Opción no válida"); return;
        }

        if (operacion != null) {
            System.out.println("Ingresa operando 1:");
            int op1 = scanner.nextInt();
            System.out.println("Ingresa operando 2:");
            int op2 = scanner.nextInt();

            System.out.println("Resultado: " + operacion.operar(op1, op2));
        }
    }
}