package com.salesianoslacuesta.ej1;


class CalculosMatematicos {

    public static int sumarCuadradosN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += (int) Math.pow(i, 2);
        }
        return suma;
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double calcularMediaNotas(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }

    public static void main(String[] args) {


        System.out.println("Ej1: " + sumarCuadradosN(3));
        System.out.println("Ej2: " + sumarCuadradosN(6));
        System.out.println("Ej3: " + sumarCuadradosN(73));


        int[] notas1 = {10, 4, 6, 1, 7};
        System.out.println("Ej1: " + calcularMediaNotas(notas1));

        int[] notas2 = {4, 7, 9, 2, 3, 7, 8};
        System.out.println("Ej2: " + calcularMediaNotas(notas2));

    }
}


