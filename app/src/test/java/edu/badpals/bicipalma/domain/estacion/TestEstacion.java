package edu.badpals.bicipalma.domain.estacion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEstacion {

    @Test
    public void constructorEstacionTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertNotNull(estacion);
        assertEquals("id: 1 \ndireccion: Manacor \nanclajes: 6", estacion.toString());
    }
}
