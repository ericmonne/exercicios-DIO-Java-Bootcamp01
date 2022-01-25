package com.company.exArrayList01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> temperaturas = new ArrayList<>();

        double somaTemperatura = 0;
        for(int i=0;i<6;i++) {
            System.out.print("Digite a temperatura: ");
            Double temp = sc.nextDouble();
            temperaturas.add(temp);
            somaTemperatura += temp;
        }
        double media = somaTemperatura/6;
        System.out.println(temperaturas);
        System.out.println(media);
        for(Double temperatura : temperaturas){
            if(temperatura>media){
                System.out.println(temperatura);
            }
        }

    }
}
