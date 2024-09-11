package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.CarroPasseio;

public class CarroPasseioTest {
    CarroPasseio carroPasseio = new CarroPasseio("Chevrolet", "Cruze", "Preto", 100000.0, 150.0, 0);

    @Test
    public void eUsadoTest(){
        assertEquals(false, carroPasseio.eUsado());
    }
}
