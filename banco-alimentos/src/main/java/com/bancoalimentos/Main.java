package com.bancoalimentos;

import com.bancoalimentos.view.MenuTerminal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema Banco de Alimentos ===");
        System.out.println();

        MenuTerminal menu = new MenuTerminal();
        menu.executarFluxoSaida();

        System.out.println();
        System.out.println("Aplicação finalizada.");
    }
}
