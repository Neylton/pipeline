package com.example.demo_api.service;

import org.springframework.stereotype.Service;

@Service
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por zero.");
        }

        return a / b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}
