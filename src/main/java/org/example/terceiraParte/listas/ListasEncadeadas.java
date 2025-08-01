package org.example.terceiraParte.listas;

public class ListasEncadeadas {
    private int dado;
    private ListasEncadeadas proximo;

    public ListasEncadeadas(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public ListasEncadeadas getProximo() {
        return proximo;
    }

    public void setProximo(ListasEncadeadas proximo) {
        this.proximo = proximo;
    }

}
