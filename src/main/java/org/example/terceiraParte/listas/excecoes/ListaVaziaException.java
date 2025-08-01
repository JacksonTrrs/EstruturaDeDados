package org.example.terceiraParte.listas.excecoes;

public class ListaVaziaException extends RuntimeException {
    public ListaVaziaException() {
        super("Exceção: Lista vazia.");
    }
}
