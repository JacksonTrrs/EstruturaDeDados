package org.example.terceiraParte.listas.excecoes;

public class ListaIndiceForaLimiteException extends Exception {

    public ListaIndiceForaLimiteException() {
        super("Exceção: Índice fora do limite.");
    }
}
