
package Estado;

import java.awt.Graphics2D;


public class ManagerEstado {
    
    public Estado EstadoActual;

    public ManagerEstado() {
        
        EstadoActual = new EstadoPartida();
    }
    
    public void Iniciar(){
        
        EstadoActual.Iniciar();
    
    }
    
    public void tick(){
        
        EstadoActual.tick();
    
    }
    
    public void crear(Graphics2D g){
    EstadoActual.crear(g);
    }
    
    public void cambiarEstado (Estado NuevoEstado){
        
        EstadoActual = NuevoEstado;
        EstadoActual.Iniciar();
    
    }
}
