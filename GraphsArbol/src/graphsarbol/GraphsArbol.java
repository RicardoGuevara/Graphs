/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphsarbol;

import java.awt.AWTException;
import java.io.IOException;

/**
 *
 * @author rpayan
 */
public class GraphsArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        grafo = new models.Graph<>();
        gui.Gui.main(args);
    }
    
    public static void save_screen_shot(java.awt.Rectangle space, String fileName) throws AWTException, IOException
    {
        java.awt.image.BufferedImage imagen = (new java.awt.Robot().createScreenCapture(space));
        javax.imageio.ImageIO.write(imagen, "jpg", new java.io.File(fileName));
        
    }
    
    public static models.Graph<String> grafo;
}
