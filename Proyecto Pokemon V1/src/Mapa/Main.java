/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import Estado.ManagerEstado;
import Teclas.Entrada;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Juan David
 */
public class Main extends JPanel {
    
    static Main Juego;
    Graphics2D Graficos2d;
    static JFrame frame;
    
   Entrada ent = new Entrada();
    
    ManagerEstado Jueg;
    
    public static int Ancho = 640, Altura = 480;
    
    public static void main(String[] args){
    frame = new JFrame("Pokemon V1");
    Juego = new Main();
    frame.add(Juego);
    frame.setSize(Ancho, Altura);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    Juego.Iniciar();
    Juego.Correr();
    
    
    }
    
    public void Iniciar(){
        
        Jueg = new ManagerEstado();
        Jueg.Iniciar();
        
        frame.addKeyListener(ent);
    
    }
    
    public void Correr(){
        while (true) { 
            
            try{
                tick();
                repaint();
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
        
    
    }
    
    public void tick(){
        
        Jueg.tick();
    
    }
    @Override
    public void paint (Graphics g){
        
        super.paint(g);
        Graficos2d = (Graphics2D) g;
        if (Graficos2d != null){
        Graficos2d.setColor(Color.lightGray);
        Graficos2d.fillRect(0,0,Ancho,Altura);
        
        Jueg.crear(Graficos2d);
        }
    
    }
    
    public static JFrame getFrame(){
    return frame;
    }
}
