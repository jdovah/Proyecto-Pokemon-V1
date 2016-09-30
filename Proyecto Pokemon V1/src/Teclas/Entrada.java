/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclas;

import Cuadro.Cuadro;
import Jugador.Jugador;
import MapaMundo.MapaMundo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan David
 */
public class Entrada implements KeyListener{
    
    boolean movimiento;
    String []pokemones={"Pikachu","Charmander","Bulbasaur","Eevee","Pidgey","Mewtwo","Spearrow","Gengar","Zapdos","MagiKarp"};

    int indic = 0;

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int nuevox = 0;
        int nuevoy = 0;
        movimiento = true;
        
       if(e.getKeyCode() == KeyEvent.VK_UP){
           
           nuevoy +=4;
       }
       
       else if(e.getKeyCode() == KeyEvent.VK_LEFT){
           
           nuevox +=4;
       }
       
       else if(e.getKeyCode() == KeyEvent.VK_DOWN){
           
           nuevoy -=4;
       }
       
       else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
           
           nuevox -=4;
       }
       
        for(Cuadro t: MapaMundo.cuadros ){
            
            if(t.Solido){
                if (t.rt.intersects(Jugador.x - nuevox, Jugador.y - nuevoy, Jugador.rt.width, Jugador.rt.height)) {
                    movimiento = false;
                    
                }
            
            }
        
        }
        
        if (movimiento) {
            MapaMundo.compx += nuevox;
            MapaMundo.compy += nuevoy;
            
        }
            
        }
       
       
    

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            Random t = new Random();
            int pok = 0;
            int indic = 0;
            String pokemon;
           indic = t.nextInt(40);
           pok = t.nextInt(9);
            if (indic > 35) {
                
                pokemon = pokemones[pok];
                
                JOptionPane.showMessageDialog(null, "Ha encontrado un "+pokemon+"");
                
            }
           
       }
       
       else if(e.getKeyCode() == KeyEvent.VK_LEFT){
           Random t = new Random();
            int pok = 0;
            int indic = 0;
            String pokemon;
           indic = t.nextInt(40);
           pok = t.nextInt(9);
            if (indic > 35) {
                
                pokemon = pokemones[pok];
                
                JOptionPane.showMessageDialog(null, "Ha encontrado un "+pokemon+"");
                
            }
           
           
       }
       
       else if(e.getKeyCode() == KeyEvent.VK_DOWN){
           Random t = new Random();
            int pok = 0;
            int indic = 0;
            String pokemon;
           indic = t.nextInt(40);
           pok = t.nextInt(9);
            if (indic > 35) {
                
                pokemon = pokemones[pok];
                
                JOptionPane.showMessageDialog(null, "Ha encontrado un "+pokemon+"");
                
            }
           
           
       }
       
       else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
          Random t = new Random();
            int pok = 0;
            int indic = 0;
            String pokemon;
           indic = t.nextInt(40);
           pok = t.nextInt(9);
            if (indic > 35) {
                
                pokemon = pokemones[pok];
                
                JOptionPane.showMessageDialog(null, "Ha encontrado un "+pokemon+"");
                
            }
          
       }
    }
    
}
