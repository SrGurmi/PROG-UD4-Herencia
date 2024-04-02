package com.salesianoslacuesta.ej2;

class Microondas extends Electrodomestico {
    private final boolean puertaAbierta;

    public Microondas(String marca, String modelo, double peso, double potencia, boolean puertaAbierta) {
        super(marca, modelo, peso, potencia);
        this.puertaAbierta = puertaAbierta;
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Algo huele a quemado");
    }

    @Override
    public String toString() {
        String estado = isEncendido() ? "Si" : "No";
        String puerta = puertaAbierta ? "Abierta" : "Cerrada";
        return "Microondas\n" +
                "-------------------------------------------------------------------------------------------------\n" +
                "* Tipo de electrodoméstico: Microondas.\n" +
                "* Marca: " + getMarca() + "\n" +
                "* Modelo: " + getModelo() + "\n" +
                "* Peso: " + getPeso() + " kg\n" +
                "* Potencia: " + getPotencia() + " kW\n" +
                "* Puerta: " + puerta + "\n" +
                "* Está encendido: " + estado + "\n" +
                "-------------------------------------------------------------------------------------------------";
    }
}

