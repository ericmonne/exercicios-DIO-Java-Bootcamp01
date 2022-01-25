package com.company.desafioCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int dado;
        int soma1=0;
        int soma2=0;
        int soma3=0;
        int soma4=0;
        int soma5=0;
        int soma6=0;
        List<Integer> resultados = new ArrayList<>();
        for(int i = 0; i<100; i++){
            dado = random.nextInt(1,7);
            resultados.add(dado);
        }
        System.out.println(resultados);
        Iterator<Integer> iterator = resultados.iterator();
        while(iterator.hasNext()){
            switch (iterator.next()) {
                case 1:
                    soma1++;
                    break;
                case 2:
                    soma2++;
                    break;
                case 3:
                    soma3++;
                    break;
                case 4:
                    soma4++;
                    break;
                case 5:
                    soma5++;
                    break;
                case 6:
                    soma6++;
                    break;
            }
        }
        System.out.println("1: " + soma1);
        System.out.println("2: " + soma2);
        System.out.println("3: " + soma3);
        System.out.println("4: " + soma4);
        System.out.println("5: " + soma5);
        System.out.println("6: " + soma6);
    }
}
