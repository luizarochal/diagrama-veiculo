package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import dominio.CarroUtilitario;

public class CarroUtilitarioTest {
    CarroUtilitario carroUtilitario = new CarroUtilitario("Fiat", "Toro", "Branco", 70000.0, 150.0, 1000.0, 0.1);

    @Test
    public void precoComDescontoTest(){
        carroUtilitario.setDescontoPJ(0.1);
        assertEquals(63000.0, carroUtilitario.calcularPrecoComDesconto());
    }
}