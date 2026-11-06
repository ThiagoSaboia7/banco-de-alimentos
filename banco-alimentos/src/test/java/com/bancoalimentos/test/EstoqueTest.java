package com.bancoalimentos.test;

import com.bancoalimentos.exception.EstoqueInsuficienteException;
import com.bancoalimentos.exception.LoteVencidoException;
import com.bancoalimentos.model.Lote;
import com.bancoalimentos.service.EstoqueService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {
    private EstoqueService estoqueService;

    @BeforeEach
    void setUp() {
        estoqueService = new EstoqueService();
    }

    @Test
    void devePermitirSaidaValida() {
        Lote loteValido = new Lote(1, 10, 100, 100.0, LocalDate.now().plusDays(15), 100.0);
        assertDoesNotThrow(() -> estoqueService.validarSaida(loteValido, 50.0));
    }

    @Test
    void deveLancarExcecaoQuandoEstoqueForInsuficiente() {
        Lote lote = new Lote(2, 10, 100, 30.0, LocalDate.now().plusDays(15), 30.0);
        assertThrows(EstoqueInsuficienteException.class, () -> {
            estoqueService.validarSaida(lote, 40.0);
        });
    }

    @Test
    void deveLancarExcecaoQuandoLoteEstiverVencido() {
        Lote loteVencido = new Lote(3, 10, 100, 50.0, LocalDate.now().minusDays(1), 50.0);
        assertThrows(LoteVencidoException.class, () -> {
            estoqueService.validarSaida(loteVencido, 10.0);
        });
    }
}
