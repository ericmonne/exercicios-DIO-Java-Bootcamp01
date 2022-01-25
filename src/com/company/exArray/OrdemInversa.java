package com.company.exArray;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor ={5, -6, 4, 31, -70, 14};

        System.out.print("Vetor: ");
        int contador=0;
        while (contador < vetor.length){
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        System.out.print("\nVetor Inverso: ");
        for(int i = (vetor.length - 1); i >=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
