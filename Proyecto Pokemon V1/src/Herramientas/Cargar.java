
package Herramientas;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Cargar {
    
    public  BufferedImage loadResource(String camino, String tipoArchivo) {
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(getClass().getClassLoader().getResource(camino + "." + tipoArchivo));
        } catch (IOException e) {
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, e);
        }
        
       return imagen;
    
    }
    
}
