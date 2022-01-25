package com.company.exercicio03;


public class Run {
    public static void main(String[] args) {
        String mes1 = "janeiro";
        ehFerias(mes1);
        String mes2 = "fevereiro";
        ehFerias(mes2);

        if(mes2.equals(mes1)) System.out.println("mentira");
    }
    private static void ehFerias(String mes){
        switch (mes){
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias!");
                break;
            default:
                System.out.println("Tá na hora de trabalhar... Ou de corrigir a escrita");
                break;
        }
    }

}
