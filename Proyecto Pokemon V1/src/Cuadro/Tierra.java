/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadro;

import Herramientas.Cargar;
import java.awt.image.BufferedImage;

/**
 *
 * @author Juan David
 */
public class Tierra extends Cuadro{
    
    public Tierra(int x, int y) {
        super(x, y, new Cargar().loadResource("Roca", "png"), true, TipoCuadro.TIERRA);
    }
    
}
