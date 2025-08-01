package org.example.terceiraParte.listas;

import org.example.terceiraParte.listas.excecoes.ListaCheiaException;
import org.example.terceiraParte.listas.excecoes.ListaIndiceForaLimiteException;
import org.example.terceiraParte.listas.excecoes.ListaVaziaException;

public class ListasEstaticas {
    private int[] array;
    private int quantidade;

    public ListasEstaticas(int tamanho) {
        this.array = new int[tamanho];
        this.quantidade = 0;
    }

    public void inserir(int e, int i) throws ListaIndiceForaLimiteException, ListaCheiaException {
        if (i < 0 || i > this.quantidade || i >= array.length){
            throw new ListaIndiceForaLimiteException();
        }
        if (this.quantidade == array.length){
            throw new ListaCheiaException();
        }
        for (int j = this.quantidade; j > i; j--){
            array[j] = array[j-1];
        }
        array[i] = e;
        this.quantidade++;
    }

    public void inserirNoFinal(int e) throws ListaCheiaException{
        if (this.quantidade == array.length){
            throw new ListaCheiaException();
        }
        array[this.quantidade] = e;
        this.quantidade++;

    }

    public int remover(int i) throws ListaIndiceForaLimiteException, ListaVaziaException {
        if (this.quantidade == 0){
            throw new ListaVaziaException();
        }
        if (i < 0 || i >= this.quantidade){
            throw new ListaIndiceForaLimiteException();
        }
        int removido = array[i];
        for (int j = i; j <= this.quantidade-2; j++) {
            array[j] = array[j+1];
        }
        array[this.quantidade-1] = 0;
        this.quantidade--;
        return removido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++){
            sb.append(array[i] + ", ");
        }
        return sb.toString();

    }
}
