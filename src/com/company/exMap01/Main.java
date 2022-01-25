package com.company.exMap01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> estadosNE = new HashMap<>(){{
            put("PE", 9616);
            put("AL", 3351);
            put("CE", 9187);
            put("RN",3535);
        }};
        estadosNE.put("RN", 3534);
        System.out.println(estadosNE);
        if(!(estadosNE.containsKey("PB"))) {
            estadosNE.put("PB", 4039);
        }
        System.out.println(estadosNE);
        System.out.println(estadosNE.get("PE"));

        Map<String, Integer> estadosNELinked = new LinkedHashMap<>(){{
            put("PE", 9616);
            put("AL", 3351);
            put("CE", 9187);
            put("RN",3535);
        }};
        System.out.println(estadosNELinked);
        Map<String, Integer> estadosNETreeMap = new TreeMap<>(estadosNE);
        System.out.println(estadosNETreeMap);
        int menorPopulacao = Collections.min(estadosNE.values());
        Set<Map.Entry<String, Integer>> entries = estadosNE.entrySet();
        String estadoMenorPopulacao = "";
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();
                System.out.println(estadoMenorPopulacao + ": " + menorPopulacao);
            }
        }
        int maiorPopulacao = Collections.max(estadosNE.values());
        String estadoMaiorPopulacao = "";
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
                System.out.println(estadoMaiorPopulacao +": " + maiorPopulacao);
            }
        }
        int soma = 0;
        for(Map.Entry<String, Integer> entry : entries){
            soma += entry.getValue();
        }
        double media = ((double) soma) /estadosNE.size();
        System.out.println(soma);
        System.out.println(media);
        Iterator<Integer> iterator = estadosNE.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next()<4000) iterator.remove();
        }
//        for(Map.Entry<String, Integer> entry: entries){ porque isso não funciona para remover?
//            if(entry.getValue()<4000){
//                estadosNE.remove(entry);
//            }
//        }
        System.out.println(estadosNE);
        estadosNE.clear();
        System.out.println(estadosNE.isEmpty());

    }
}
