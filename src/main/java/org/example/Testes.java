package org.example;

import org.example.terceiraParte.listas.ListaIndiceForaLimiteException;
import org.example.terceiraParte.listas.ListasEncadeadas;
import org.example.terceiraParte.listas.ListasEstaticas;

public class Testes {
    public static void main(String[] args) throws ListaIndiceForaLimiteException {
        TestandoListasEncadeadas();
        imprimirListaEncadeadas();
    }

    public static void imprimirListaEncadeadas(){
        ListasEncadeadas p = new ListasEncadeadas(5);
        p.setProximo(new ListasEncadeadas(70));
        p.getProximo().setProximo(new ListasEncadeadas(4));
        p.getProximo().getProximo().setProximo(new ListasEncadeadas(31));
        p.getProximo().getProximo().setDado(12);
        p.getProximo().getProximo().getProximo().setProximo(new ListasEncadeadas(42));

        ListasEncadeadas lixo = p;

            while (lixo != null) {

                System.out.println(lixo.getDado());

                lixo = lixo.getProximo();
            }
    }

    public static void TestandoListasEncadeadas() throws ListaIndiceForaLimiteException {
        ListasEstaticas lista = new ListasEstaticas(5);
        lista.inserir(1, 0);
        lista.inserir(2, 1);
        lista.inserirNoFinal(3);
        System.out.println(lista.toString());
        lista.remover(1);
        System.out.println(lista.toString());
    }
}