package com.company.desafioFaseDaLua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        }else if(inicio>=0 && (fim >=3 && fim <=96) && inicio < fim){
            System.out.println("crescente");
        }else if(fim>=97 && fim <=100){
            System.out.println("cheia");
        }else if(inicio<=96 && fim>=3 && inicio > fim){
            System.out.println("minguante");
        }

    }
}
