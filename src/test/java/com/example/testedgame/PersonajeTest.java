package com.example.testedgame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class PersonajeTest {

    @Test
    public void puedeJugarBienConUnaVida(){
        //Arraange
        int vidas = 1;
        int puntos = 0;
        Personaje personaje = new Personaje();
        personaje.setPuntos(puntos);
        personaje.setVidas(vidas);
        boolean juegaBien = true;

        //Act
        boolean resultado = personaje.jugar(juegaBien);

        //Assert
        assertEquals(true, resultado);
    }

    @Test
    public void noPuedeSeguirJugandoDespuesDeJugarMalConUnaVida(){
        //Arraange
        int vidas = 1;
        int puntos = 0;
        Personaje personaje = new Personaje();
        personaje.setPuntos(puntos);
        personaje.setVidas(vidas);


        //Act
        boolean resultado = personaje.jugar(false);

        //Assert
        assertEquals(false, resultado);
    }



    @Test
    public void puedeSeguirJugandoConUnaVida(){
        //Arrange
        int vidas = 1;
        Personaje personaje = new Personaje();
        personaje.setVidas(1);

        //Act
        boolean puedeSeguirJugando = personaje.puedeSeguirJugando();

        //Assert
        assertTrue(puedeSeguirJugando);

    }

    @Test
    public void NoPuedeSeguirJugandoSiTieneCeroVidas(){

        //Arrange
        Personaje personaje = new Personaje();
        personaje.setVidas(0);

        //Act
        boolean puedeSeguirJugando = personaje.puedeSeguirJugando();

        //Assert
        assertFalse(puedeSeguirJugando);

    }
}
