package com.company.exArray;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Consoantes {
    public static void main(String[] args) {
//        char[] vetor = {'a', 'b', 'c', 'd', 'e', 'f'};
//        int contConsoante = 0;
//        for(int i = 0; i < vetor.length; i++){
//            if(vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] !='u'){
//                contConsoante++;
//                System.out.println(vetor[i]);
//            }
//        }
//        System.out.println(contConsoante + " consoantes.");

        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6];
        int contConsoantes = 0;
        int contador = 0;
        do{
            System.out.println("Digite uma letra: ");
            String letra = scanner.next();

            if(!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                    || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                    || letra.equalsIgnoreCase("u"))){
                consoantes[contador] = letra;
                contConsoantes++;
            }
            contador++;
        }while(contador < consoantes.length);

        System.out.print("Consoantes: ");
        for(String consoante : consoantes){
            if(consoante != null){
                System.out.println(consoante + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + contConsoantes);
        System.out.println(consoantes.length);
    }
}
