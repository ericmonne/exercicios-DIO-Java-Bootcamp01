package com.company.exLoop;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        /*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int idade = 1;
        String nome;
        while(idade!=0){
            System.out.print("Digite o seu nome: ");
            nome = sc.next();
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            contador++;
            System.out.println("Nome do aluno " + contador + ": " + nome);
            System.out.println("Idade do aluno " + contador + ": " + idade + " anos.");
        };
    }
}
