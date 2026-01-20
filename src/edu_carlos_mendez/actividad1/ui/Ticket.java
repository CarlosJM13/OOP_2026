package edu_carlos_mendez.actividad1.ui;

import edu_carlos_mendez.actividad1.data.Auto;
import edu_carlos_mendez.actividad1.process.Catalogo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Ticket {
    private Scanner scanner;
    private Catalogo catalogo;

    public Ticket() {
        this.scanner = new Scanner(System.in);
        this.catalogo = new Catalogo();
    }

    public void mostrarMenu() {
        ArrayList<Auto> carrito = new ArrayList<>();

        System.out.println("BIENVENIDO AL SISTEMA DE VENTAS");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- VEHICULOS DISPONIBLES ---");
            ArrayList<Auto> lista = catalogo.getListaAutos();

            for (int i = 0; i < lista.size(); i++) {
                Auto v = lista.get(i);
                System.out.println((i + 1) + ". " + v.getMarca() + " " + v.getModelo() + " - $" + v.getPrecio());
            }

            System.out.println("0. Terminar compra");
            System.out.print("Seleccione un numero: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                opcion = -1;
            }

            if (opcion > 0 && opcion <= lista.size()) {
                Auto seleccionado = catalogo.obtenerVehiculo(opcion - 1);
                if (seleccionado != null) {
                    carrito.add(seleccionado);
                    System.out.println(">> Añadido al carrito: " + seleccionado.getModelo());
                }
            }
        }
        imprimirTicket(nombreCliente, carrito);
    }

    private void imprimirTicket(String cliente, ArrayList<Auto> carrito) {
        System.out.println("\n==================================");
        System.out.println("         TICKET DE VENTA");
        System.out.println("==================================");
        System.out.println("Fecha: " + new Date());
        System.out.println("Cliente: " + cliente);
        System.out.println("----------------------------------");

        for (Auto v : carrito) {
            System.out.println("* " + v.getMarca() + " " + v.getModelo());
        }
        double total = catalogo.calcularTotal(carrito);

        System.out.println("----------------------------------");
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("==================================");
    }
}