package br.senai.m2s8.model;

import javax.validation.constraints.NotEmpty;

public class ItemDeLista {

    @NotEmpty(message = "campo.obrigatorio")
    private String descricao;
    private int quantidade;
    private String medida;

    public ItemDeLista() {
    }

    public ItemDeLista(String descricao, int quantidade, String medida) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.medida = medida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return quantidade + " " + medida + " de " + descricao;
    }
}
