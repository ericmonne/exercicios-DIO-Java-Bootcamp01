package com.company.exArrayList03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> respostas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Responda 1 para sim e 0 para não");
        System.out.print("Telefonou para a vítima? ");
        respostas.add(sc.nextInt());
        System.out.print("Esteve no local do crime? ");
        respostas.add(sc.nextInt());
        System.out.print("Mora perto da vítima? ");
        respostas.add(sc.nextInt());
        System.out.print("Devia para a vítima? ");
        respostas.add(sc.nextInt());
        System.out.print("Já trabalhou com a vítima? ");
        respostas.add(sc.nextInt());
        int somaRespostas = 0;
        for(int resposta : respostas){
            somaRespostas += resposta;
        }
        switch(somaRespostas){
            case 0:
            case 1:
                System.out.println("Inocente.");
                break;
            case 2:
                System.out.println("Suspeita.");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice.");
                break;
            case 5:
                System.out.println("Culpada!");
                break;
            default:
                System.out.println("Digite respostas válidas.");
        }
    }
}
