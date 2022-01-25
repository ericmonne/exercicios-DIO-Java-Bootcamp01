package com.company.exercicio02;

public class Quadrilatero {
    public double area;

    public double calcularArea(double lado){
        area = lado * lado;
        return lado;
    }
    public double calcularArea(double base, double altura){
        area = base * altura;
        return area;
    }
    public double calcularArea(double baseMaior, double baseMenor, double altura){
        area = ((baseMaior+baseMenor)*altura)/2;
        return area;
    }
}
