package com.company.exLoop;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
            int numero = sc.nextInt();
            soma = soma + numero;
            if(numero > maior){
                maior = numero;
            }
        }
        double media = soma/5.0;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
    }
}
