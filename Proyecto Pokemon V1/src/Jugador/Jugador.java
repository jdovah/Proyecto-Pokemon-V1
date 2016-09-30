/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Mapa.Main;
import MapaMundo.MapaMundo;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javafx.animation.Animation;

/**
 *
 * @author Juan David
 */
public class Jugador {
    
    public static int y;
    public static int x;
    public int Ancho;
    public int Altura;
    Animation [] animations;
    
    public static Rectangle rt;
    
    public Jugador(int Ancho, int Altura) {
        
        this.y=(Main.Altura/2)-(Altura/2);
        this.Altura = Altura;
        this.x=(Main.Ancho/2)-(Ancho/2);
        this.Ancho = Ancho;
        
        rt = new Rectangle(x,y, Ancho, Altura);
        
    
    
    }
    
    public void tick(){
        
        rt.setBounds(x+MapaMundo.compx, y+MapaMundo.compy, Ancho, Altura);
    
    }
    
    public void crear(Graphics2D g){
        
        g.setColor(Color.white);
        g.fillRect(x, y, Ancho, Altura);
    
    }
}
