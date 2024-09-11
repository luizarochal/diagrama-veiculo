package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import dominio.CarroPasseio;

public class CarroPasseioTest {
    CarroPasseio carroPasseio = new CarroPasseio("Chevrolet", "Cruze", "Preto", 100000.0, 150.0, 0);

    @Test
    public void eUsadoTest(){
        assertEquals(false, carroPasseio.eUsado());
    }

    @Test
    public void eUsadoTest2(){
        carroPasseio.setQuilometragem(0);
        assertNotSame(true, carroPasseio.eUsado());
    }
}
