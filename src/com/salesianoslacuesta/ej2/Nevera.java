package com.salesianoslacuesta.ej2;

class Nevera extends Electrodomestico {
    private final int temperatura;

    public Nevera(String marca, String modelo, double peso, double potencia, int temperatura) {
        super(marca, modelo, peso, potencia);
        this.temperatura = temperatura;
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("¡Ños, fuerte pelete!");
    }

    @Override
    public String toString() {
        String estado = isEncendido() ? "Si" : "No";

        return
                "Nevera\n" +
                "-------------------------------------------------------------------------------------------------\n" +
                "* Tipo de electrodoméstico: Nevera.\n" +
                "* Marca: " + getMarca() + "\n" +
                "* Modelo: " + getModelo() + "\n" +
                "* Peso: " + getPeso() + " kg\n" +
                "* Potencia: " + getPotencia() + " kW\n" +
                "* Temperatura: " + temperatura + "°C\n" +
                "* Está encendido: " + estado + "\n" +
                "-------------------------------------------------------------------------------------------------";
    }
}













