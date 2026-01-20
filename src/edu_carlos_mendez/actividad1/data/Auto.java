package edu_carlos_mendez.actividad1.data;

public class Auto {
    private String marca;
    private String modelo;
    private double precio;

    public Auto(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
}