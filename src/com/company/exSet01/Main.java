package com.company.exSet01;

import java.util.*;

public class Main {

    private static Iterator<String> iterator;

    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>(Arrays.asList
                ("azul", "amarelo", "verde", "vermelho", "violeta", "laranja", "anil"));
        System.out.println(arcoIris);
        for(String cor: arcoIris) System.out.println(cor);
        System.out.println(arcoIris.size());
        Set<String> arcoIrisTree = new TreeSet<>(arcoIris);
        System.out.println(arcoIrisTree);
        Set<String> arcoIrisLinked = new LinkedHashSet<>(Arrays.asList
                ("azul", "amarelo", "verde", "vermelho", "violeta", "laranja", "anil"));

        List<String> arcoIrisList = new ArrayList<>(arcoIrisLinked);
        Collections.reverse(arcoIrisList);
        Iterator<String> iterator = arcoIrisLinked.iterator();
        while(iterator.hasNext()){
            if(iterator.next().contains("v")){
                iterator.remove();
            }
        }
        System.out.println(arcoIrisLinked);

        for(String cor: arcoIris){
            if(cor.contains("v")) System.out.println(cor);
        }
//        for(String cor: arcoIrisLinked){ //não entendo porque funciona só se o conjunto aqui for diferente do conjunto da linha 25, independente do tipo de conjunto
//            if(cor.contains("v")){
//                arcoIris.remove(cor);
//            }
//        }

        System.out.println(arcoIris);
        arcoIris.clear();
        System.out.println(arcoIris);
        System.out.println(arcoIrisList);


    }

}

