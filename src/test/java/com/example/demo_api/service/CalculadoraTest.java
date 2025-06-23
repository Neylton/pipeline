package com.example.demo_api.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class CalculadoraTest {
    @InjectMocks
    private Calculadora calculadora;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testeSomar() {
        int res = calculadora.somar(2, 2);
        Assertions.assertEquals(4, res);
    }

    @Test
    void testeSubtrair() {
        int res = calculadora.subtrair(2, 2);
        Assertions.assertEquals(0, res);
    }

    @Test
    void testeDividirSucesso() {
        int res = calculadora.dividir(2, 2);
        Assertions.assertEquals(1, res);
    }

    @Test
    void testeDivisaoPorZero() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculadora.dividir(2,0));
        Assertions.assertNotNull(ex);
    }

    @Test
    void testeMultiplicar() {
        int res = calculadora.multiplicar(2,2);
        Assertions.assertEquals(4, res);
    }
}
