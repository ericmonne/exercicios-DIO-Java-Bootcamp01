package com.company.exercicio01;

public class Relogio {
    public int hora;

    public String saudar(int hora){
        if(hora>24){
            return "não foi informado um horário real";
        }
        if (hora > 05 && hora < 12){
            return "bom dia, patrão Bruce!";
        }
        if(hora<19){
            return "boa tarde, patrão Bruce!";
        }
        if(hora<05 || hora > 19){
            return "boa noite, patrão Bruce. O senhor deveria descansar.";
        }
        return null;
    }
}
