package br.senai.m2s8.model;

public class Lista {
    private String nome;

    public Lista() {
    }

    public Lista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
