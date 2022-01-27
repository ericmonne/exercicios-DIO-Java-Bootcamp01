package com.company.desafioIntermediario03;

import java.io.IOException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String O = leitor.next();
        double[][] M = new double[12][12];
        double soma = 0;
        for(int i = 0; i<12; i++){
            for(int j = 0; j<12;j++){
                M[i][j] = leitor.nextDouble();
            }

        }
        int count = 0;
        for(int i = 0; i<12; i++){
            for(int j = 0; j<12;j++){
                if(j>i){
                    soma += M[i][j];
                    count++;}
            }

        }
        double media = soma/count;
        if(O.equalsIgnoreCase("S")){
            System.out.println(soma);
        }
        else System.out.printf("%.1f ", media);
    }
}
