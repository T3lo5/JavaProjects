package com.teste;

import org.junit.Test;

import static org.junit.Assert.*;

public class calculadoraTest {

    @Test
    public void testSomar() {
        calculadora calculadora = new calculadora();
        int resultado = calculadora.somar("1+2+3");
        assertEquals(6, resultado);
    }
}