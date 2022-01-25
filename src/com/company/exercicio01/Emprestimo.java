package com.company.exercicio01;

public class Emprestimo {
    public double valorInicial;
    public double taxa;
    public int qtdParcelas;
    public double valorTotal;
    public double parcelaMensal;

    public double calcularTaxas(int qtdParcelas){
        if(qtdParcelas>24){
            taxa = 2.3;
        }
        if(qtdParcelas>12){
            taxa = 2.0;
        }
        if(qtdParcelas>6){
            taxa = 1.4;
        }
        if(qtdParcelas>3){
            taxa = 0.8;
        }
        else{
            taxa = 0.5;
        }
        return taxa;
    }

    public double calcularTotal(double taxa, double valorInicial){
        calcularTaxas(qtdParcelas);
        valorTotal = valorInicial + valorInicial*taxa;
        return valorTotal;
    }
    public double calcularParcela(double valorTotal, int qtdParcelas){
        calcularTotal(taxa, valorInicial);
        parcelaMensal = valorTotal/qtdParcelas;
        return parcelaMensal;
    }
}
