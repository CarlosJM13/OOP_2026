package edu_carlos_mendez.actividad1.process;
import edu_carlos_mendez.actividad1.data.Auto;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Auto> listaAutos;

    public Catalogo() {
        listaAutos = new ArrayList<>();
        // Inicializamos los datos
        listaAutos.add(new Auto("Toyota", "Corolla", 25000));
        listaAutos.add(new Auto("Ford", "Fiesta", 15000));
        listaAutos.add(new Auto("Chevrolet", "Camaro", 40000));
        listaAutos.add(new Auto("Nissan", "Sentra", 22000));
    }

    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public Auto obtenerVehiculo(int indice) {
        if (indice >= 0 && indice < listaAutos.size()) {
            return listaAutos.get(indice);
        }
        return null;
    }

    public double calcularTotal(ArrayList<Auto> carrito) {
        double total = 0;
        for (Auto v : carrito) {
            total += v.getPrecio();
        }
        return total;
    }
}