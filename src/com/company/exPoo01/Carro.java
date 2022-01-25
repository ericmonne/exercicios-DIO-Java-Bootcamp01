package com.company.exPoo01;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private int portas;
    private boolean arCondicionado;
    private int capacidadeTanque;

    public Carro() {
    }

    public Carro(String modelo, String marca, int ano, String cor, int portas, boolean arCondicionado, int capacidadeTanque) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.portas = portas;
        this.arCondicionado = arCondicionado;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Carro(String modelo, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double calcularValorTanqueCheio(double precoGasolina){
        double valorTanqueCheio = precoGasolina*getCapacidadeTanque();
        return valorTanqueCheio;
    }

}
