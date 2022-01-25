package com.company.exercicio02;

public class Trapezio {
    public double baseMaior;
    public double baseMenor;
    public double altura;
    public double area;

    public double calcularArea(double baseMaior, double baseMenor, double altura){
        area = ((baseMaior + baseMenor)*altura)/2;
        return area;
    }
}
