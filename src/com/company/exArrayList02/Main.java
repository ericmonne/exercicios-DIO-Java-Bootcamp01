package com.company.exArrayList02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Mes> temperaturas = new ArrayList<>();

        double somaTemp = 0;
        for(int i = 0; i<6; i++){
            System.out.print("Nome do mês: ");
            String nome = sc.next();
            System.out.print("Temperatura média: ");
            Double temperatura = sc.nextDouble();
            somaTemp += temperatura;
            Mes mes = new Mes(nome, temperatura);
            temperaturas.add(mes);
        }
        System.out.println(temperaturas);
        double media = somaTemp/6;
        System.out.printf("Média: %.2f", media);
        for(Mes mes: temperaturas){
            if(mes.getTemperatura()>media){
                System.out.println(mes);
            }
        }
    }
}
