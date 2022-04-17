package br.senai.m2s8.mbean;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class ListaBean implements Serializable {
    private String item;
    private int quantidade;
    private String medida;
    private List<String> lista = new ArrayList<>();
    private List<String> itensSelecionados = new ArrayList<>();

    public void adicionar() {
        lista.add(quantidade + " " + medida + " de " + item);
        item = null;
        quantidade = 0;
        medida = null;
    }

    public void selecionar() {
        itensSelecionados.add(item);
    }

    public void remover() {
        lista.removeAll(itensSelecionados);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public List<String> getItensSelecionados() {
        return itensSelecionados;
    }

    public void setItensSelecionados(List<String> itensSelecionados) {
        this.itensSelecionados = itensSelecionados;
    }
}
