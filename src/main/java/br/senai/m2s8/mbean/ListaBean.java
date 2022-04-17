package br.senai.m2s8.mbean;

import br.senai.m2s8.model.ItemDeLista;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class ListaBean implements Serializable {
    private ItemDeLista item = new ItemDeLista();
    private List<String> lista = new ArrayList<>();
    private List<String> itensSelecionados = new ArrayList<>();

    public void adicionar() {
        lista.add(item.toString());
    }

    public void remover() {
        lista.removeAll(itensSelecionados);
    }

    public ItemDeLista getItem() {
        return item;
    }

    public void setItem(ItemDeLista item) {
        this.item = item;
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
