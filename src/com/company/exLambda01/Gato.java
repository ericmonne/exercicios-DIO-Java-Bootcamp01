package com.company.exLambda01;

import java.util.Objects;

public class Gato {
    String nome;
    int idade;

    public Gato() {
    }

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return idade == gato.idade && Objects.equals(nome, gato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
