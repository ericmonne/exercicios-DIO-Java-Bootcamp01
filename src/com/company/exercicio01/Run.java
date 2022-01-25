package com.company.exercicio01;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.print("Informe o primeiro operando: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o segundo operando: ");
        double b = scanner.nextDouble();
        System.out.println(calculadora.multiplicacao(a, b));
        System.out.println(calculadora.soma(a, b));
        System.out.println(calculadora.divisao(a, b));
        System.out.println(calculadora.subtracao(a, b));
        System.out.print("Informe a hora: ");
        int hora = scanner.nextInt();
        Relogio alfred = new Relogio();
        System.out.println(alfred.saudar(hora));
        System.out.print("Qual o valor do empréstimo? ");
        double valorInicial = scanner.nextDouble();
        Emprestimo emprestimo = new Emprestimo();
        System.out.print("O pagamento será realizado em quantas parcelas? ");
        int qtdParcelas = scanner.nextInt();
        System.out.println(emprestimo.calcularTaxas(qtdParcelas));
        System.out.println(emprestimo.calcularTotal(emprestimo.taxa, valorInicial));
        System.out.println(emprestimo.calcularParcela(emprestimo.valorTotal, qtdParcelas));;
    }
}
