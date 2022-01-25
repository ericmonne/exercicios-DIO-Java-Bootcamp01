package com.company.desJava;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int senha=0;
        while(senha!=2002){
            senha = leitor.nextInt();
            if(senha!=2002)System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
}
}

