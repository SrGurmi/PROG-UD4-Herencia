package com.salesianoslacuesta.ej2;

class Electrodomestico {
    private final String marca;
    private final String modelo;
    private final double peso;
    private final double potencia;
    private boolean encendido;

    public Electrodomestico(String marca, String modelo, double peso, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.potencia = potencia;
        boolean encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPeso() {
        return peso;
    }

    public double getPotencia() {
        return potencia;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }
}

