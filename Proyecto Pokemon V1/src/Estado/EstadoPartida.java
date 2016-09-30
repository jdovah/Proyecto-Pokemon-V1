/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

import MapaMundo.MapaMundo;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Juan David
 */
public class EstadoPartida extends Estado{
    
    MapaMundo mapaMundo;
    

    @Override
    public void Iniciar() {
        
        mapaMundo = new MapaMundo(15,15);
       
    }

    @Override
    public void tick() {
        
        mapaMundo.tick();
       
    }

    @Override
    public void crear(Graphics2D g) {
        g.setColor(Color.red);
        g.drawString("", 0, 20);
        mapaMundo.crear(g);
    }
    
}
