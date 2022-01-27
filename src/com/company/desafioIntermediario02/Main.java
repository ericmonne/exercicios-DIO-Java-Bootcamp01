package com.company.desafioIntermediario02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        int n = 0;
        int k = scan.nextInt();
        if(k==1){
            n = 1;

        }
        else if(k<=3){
            n=3;

        }
        else if(k<=5){
            n=5;
        }
        else if(k<=10){
            n=10;
        }
        else if(k<=25){
            n=25;
        }
        else if(k<=50){
            n=50;
        }
        else if(k<=100){
            n=100;
        }

        System.out.print("Top " + n);
    }
}
