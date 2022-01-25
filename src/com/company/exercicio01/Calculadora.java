package com.company.exercicio01;

public class Calculadora {
    public double a;
    public double b;
    

    public double soma(double a, double b){
        return a+b;
    }
    public double subtracao(double a, double b){
        return a-b;
    }
    public double multiplicacao(double a, double b){
        return a*b;
    }
    public Object divisao(double a, double b){
        if(b == 0){
            return "não é possível dividir por 0";
        }
        return a/b;
    }
}
