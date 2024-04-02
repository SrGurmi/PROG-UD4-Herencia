package com.salesianoslacuesta.ej2;

public class Main {
    public static void main(String[] args) {

        Nevera miNevera = new Nevera("Samsung", "NF500", 50.5, 0.8, 4);
        Microondas miMicroondas = new Microondas("LG", "MGX200", 20.0, 1.2, true);


        miNevera.encender();
        miMicroondas.encender();


        System.out.println(miNevera);

        System.out.println();

        System.out.println(miMicroondas);


        miNevera.apagar();
        miMicroondas.apagar();
    }
}

