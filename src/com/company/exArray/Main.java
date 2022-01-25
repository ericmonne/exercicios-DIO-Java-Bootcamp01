package com.company.exArray;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        int i, num = 5;
//        for (i = 0; i < 3; i++) {
//            num += i;
//            System.out.print(i);
//        }
//        int num = 5, count = 1;
//        do {
//            num += count;
//            System.out.println(num);
//        } while (count <= 3);

//        int num = 5, count = 1;
//        while(count <= 3) {
//            ++count;
//            num += count;
//        }
//        System.out.println(num);
//        int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
//        System.out.print(numeros[2][2]);

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i<=10000; i++) {
            if (i % N == 2 ) System.out.println( i     );
        }
    }

}
