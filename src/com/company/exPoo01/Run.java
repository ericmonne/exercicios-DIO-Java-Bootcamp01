package com.company.exPoo01;

public class Run {
    public static void main(String[] args) {
        Carro palio = new Carro("Palio", "verde", 100);
        Carro voyage = new Carro("Voyage", "preto", 130);
        Carro siena = new Carro("Siena", "laranja", 85);
        siena.setAno(2007);
        palio.setAno(2001);
        voyage.setAno(2009);
        System.out.println(siena.calcularValorTanqueCheio(2.5));
        System.out.println(palio.calcularValorTanqueCheio(1.78));
        System.out.println(voyage.calcularValorTanqueCheio(6.75));
    }
}
