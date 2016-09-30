
package Estado;

import java.awt.Graphics2D;


public abstract class Estado {
    
    public abstract void Iniciar();
    public abstract void tick();
    public abstract void crear(Graphics2D g);

    void crear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
