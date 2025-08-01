package org.example.terceiraParte.listas;

public class ListaVaziaException extends RuntimeException {
    public ListaVaziaException() {
        super("Exceção: Lista vazia.");
    }
}
