package com.company.exercicio02;

public class Run {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Trapezio trapezio = new Trapezio();
        Quadrilatero quadrilatero = new Quadrilatero();
        System.out.println(quadrilatero.calcularArea(5));
        System.out.println(quadrilatero.calcularArea(19));
        System.out.println(quadrilatero.calcularArea(5, 6));
        System.out.println(quadrilatero.calcularArea(20, 12));
        System.out.println(quadrilatero.calcularArea(3, 1, 4));
        System.out.println(quadrilatero.calcularArea(8.3,3.9,6.2));

    }
}
