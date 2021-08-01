package com.example.testedgame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personaje {

    private String nombre;
    private Integer puntos;
    private Integer vidas;

    public boolean puedeSeguirJugando(){
        return vidas > 0;
    }


    public boolean jugar(boolean jugarBien){
        int random = (int) (Math.random() * 10) + 1;
                if(jugarBien) {
                    puntos += random * 20;
                } else {
                    puntos += random * 10;
                    vidas--;
                } return puedeSeguirJugando();
    }

    public String getResultados(){
        return this.nombre+" terminó con "
                + this.puntos + " puntos y "
                + this.vidas + " vidas.";
    }

}
