/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapaMundo;

import Cuadro.Cuadro;
import Cuadro.Pasto;
import Cuadro.Tierra;
import Jugador.Jugador;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Juan David
 */
public class MapaMundo {

    public static ArrayList<Cuadro> cuadros = new ArrayList<Cuadro>();
    int AnchoMapa;
    int AlturaMapa;
    
    public static int compx=0;
    public static int compy=0;
    public Jugador p;

    public MapaMundo(int AnchoMapa, int AlturaMapa) {

        this.AnchoMapa = AnchoMapa;
        this.AlturaMapa = AlturaMapa;
        
        p = new Jugador(40, 40);

        GenerarMundo();

    }

    public void GenerarMundo() {
        Random r = new Random();
        int indice = 0;

        for (int x = 0; x < AnchoMapa; x++) {
            for (int y = 0; y < AlturaMapa; y++) {
                indice=r.nextInt(10);
                
                if (indice == 0){
                
                cuadros.add(new Tierra(x*Cuadro.tamano,y * Cuadro.tamano));
                
                }else{
                
                cuadros.add(new Pasto(x*Cuadro.tamano,y * Cuadro.tamano));
                }

            }
        }
    }

    
    
    public void tick(){
        
        for(Cuadro t: cuadros){
            t.tick();
        }
    }
    
    public void crear(Graphics2D g){
        
        for(Cuadro t:cuadros){
        
        t.crear(g);
        }
        p.crear(g);
    }
}
