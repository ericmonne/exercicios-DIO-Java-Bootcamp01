package com.company.exLoop;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int qtdeNumeros = sc.nextInt();
        int qtePares = 0;
        int qteImpares = 0;
        int contador = 0;
        do{
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            if(numero %2 == 0) qtePares++;
            else qteImpares++;
            contador++;
        }while(contador<qtdeNumeros);
        System.out.println("Pares: " +qtePares);
        System.out.println("Impares: " + qteImpares);
    }
}
