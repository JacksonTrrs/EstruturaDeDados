package org.example.terceiraParte.listas.excecoes;

public class ListaCheiaException extends RuntimeException {
    public ListaCheiaException() {
        super("Exceção: Lista cheia.");
    }
}
