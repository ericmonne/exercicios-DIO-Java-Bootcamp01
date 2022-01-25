package com.company.exLambda01;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Gato> gatos = new HashMap<>();
        gatos.put(1, new Gato("Stalin", 2));
        gatos.put(2, new Gato("Lenin", 5));
        gatos.put(3, new Gato("Mao",4));
        gatos.put(4, new Gato("Fidel", 7));

        System.out.println(gatos);
        for(Map.Entry<Integer, Gato> entry : gatos.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println("---Ordem de Idade---");
//        Set<Map.Entry<Integer, Gato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Gato>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Gato> g1, Map.Entry<Integer, Gato> g2) {
//                return Integer.compare(g1.getValue().getIdade(), g2.getValue().getIdade());
//            }
//        });
//        Set<Map.Entry<Integer, Gato>> set = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer, Gato>, Integer>() {
//                    @Override
//                    public Integer apply(Map.Entry<Integer, Gato> integerGatoEntry) {
//                        return integerGatoEntry.getValue().getIdade();
//                    }
//                }
//        ));
        Set<Map.Entry<Integer, Gato>> set = new TreeSet<>(Comparator.comparing(
                integerGatoEntry -> integerGatoEntry.getValue().getIdade()));
        set.addAll(gatos.entrySet());
        for(Map.Entry<Integer, Gato> entry: set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getIdade() + ": " +entry.getValue().getNome());
        }

    }
}
