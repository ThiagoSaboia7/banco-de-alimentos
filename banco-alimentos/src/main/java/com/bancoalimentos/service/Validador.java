package com.bancoalimentos.service;

public interface Validador<T> {
    boolean validar(T objeto);
}
