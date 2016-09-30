
package Cuadro;

import MapaMundo.MapaMundo;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;


public class Cuadro {
    
    public static final int tamano = 64;
    
    public int y;
    public int x;
    
    public BufferedImage imagen;
    public boolean Solido;
    public Rectangle rt = new Rectangle();
    
    public TipoCuadro tipoCuadro;
    
    public Cuadro (int x, int y, BufferedImage imagen, boolean solido, TipoCuadro tipoCuadro) {
        
        this.x = x;
        this.y = y;
        this.imagen= imagen;
        this.Solido=solido;
        this.tipoCuadro = tipoCuadro;
    
    
    }
    public void tick (){
        
        rt.setBounds(x+MapaMundo.compx, y+MapaMundo.compy, tamano, tamano);
    
    }
    
    public void crear (Graphics2D g) {
        
        g.drawImage(imagen, x+MapaMundo.compx, y+MapaMundo.compy, tamano, tamano, null);
    
    }
}
