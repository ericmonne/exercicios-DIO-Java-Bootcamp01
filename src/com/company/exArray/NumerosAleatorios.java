package com.company.exArray;

import java.util.Scanner;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class NumerosAleatorios {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        for(int numero : numeros){
            System.out.println("numero: " + numero);
            int sucessor = numero + 1;
            System.out.println("sucessor: " + sucessor);
        }

    }
}
