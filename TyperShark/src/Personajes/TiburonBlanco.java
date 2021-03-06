/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import javafx.scene.image.*;
import typershark.Constantes;
import typershark.Oceano;

/**
 *
 * @author Dario Ntn Carpio
 */
public class TiburonBlanco extends Animal{
    private final int puntos = 50;    
    
    public TiburonBlanco(){        
        super(Constantes.VEL_TIBURON);
        int x, y;
        x = (int)(Math.random()*200) + 600;
        y = (int)(Math.random()*Constantes.SCREEN_HEIGHT/2);
        this.setPosicionInicial(x, y);
        this.setAnimal(Oceano.getPalabraRandom(), new ImageView(new Image("/imagenes/shark.png",Constantes.WIDTH_SHARK,Constantes.HEIGHT_SHARK,true,true)));
    }
    
    @Override
    public int getPuntos(){
        return puntos;
    }

    @Override
    protected double getLimite() {
        return -1*Constantes.SCREEN_WIDTH/2 +50;
    }
}
