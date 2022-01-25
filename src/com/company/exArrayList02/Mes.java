package com.company.exArrayList02;

public class Mes {
    private double temperatura;
    private String nome;

    public Mes() {
    }

    public Mes(double temperatura) {
        this.temperatura = temperatura;
    }

    public Mes(String nome) {
        this.nome = nome;
    }

    public Mes(String nome, Double temperatura) {
        this.temperatura = temperatura;
        this.nome = nome;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" + temperatura + " graus em "
                + nome + '\'' +
                '}';
    }
}
