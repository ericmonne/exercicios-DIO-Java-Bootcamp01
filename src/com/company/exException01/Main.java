package com.company.exException01;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Entrada inválida, informe novamente");
            } catch (ArithmeticException e) {  //não vai ocorrer pq coloquei tudo como double, levando ao infinity, não ao zero
                e.printStackTrace();
            } finally {
                System.out.println("Chegamos ao Finally");
            }
        }while(continueLooping);

        JOptionPane.showMessageDialog(null, "Programa Finalizado");
    }

    public static double dividir(double a, double b){ return a/b;}
}
