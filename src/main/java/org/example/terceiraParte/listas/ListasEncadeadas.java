package org.example.terceiraParte.listas;

import org.example.terceiraParte.listas.excecoes.ListaIndiceForaLimiteException;

public class ListasEncadeadas {
    private int dado;
    private ListasEncadeadas proximo;

    public ListasEncadeadas(int dado) {
        this.dado = dado;
    }

    public void inserir(int e, int i, ListasEncadeadas primeiroNo) throws ListaIndiceForaLimiteException {
        if (i < 0) {
            throw new ListaIndiceForaLimiteException();
        }

        ListasEncadeadas aux = primeiroNo;
        ListasEncadeadas novoNo = new ListasEncadeadas(e);

        if (i == 0) {
            novoNo.setProximo(primeiroNo);
            primeiroNo = novoNo;
            return;
        }

        for (int j = 0; j < i; j++) {
            aux = aux.getProximo();
            if (aux == null){
                throw new ListaIndiceForaLimiteException();
            }
        }
        novoNo.setProximo(aux.getProximo());
        aux.setProximo(novoNo);
    }

    public int buscar(int e, ListasEncadeadas primeiroNo) {
        ListasEncadeadas aux = primeiroNo;
        int i = 0;
        while (aux != null) {
            if (aux.getDado() == e) {
                return i;
            }
            aux = aux.getProximo();
            i++;
        }
        return -1;
    }

    public void imprimir(ListasEncadeadas primeiroNo) {
        System.out.print("Início -> ");
        ListasEncadeadas aux = primeiroNo;
        while (aux != null) {
            System.out.print(aux.getDado() + " ");
            aux= aux.getProximo();
        }
        System.out.print(" <- Fim\n");
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
