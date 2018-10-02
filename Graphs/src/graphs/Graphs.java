/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.awt.AWTException;
import java.io.IOException;
import models.*;

/**
 *
 * @author rick
 */
public class Graphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        grafo = new Graph<String>();
        gui.GeneralGUI.main(args);
    }
    
    public static void save_screen_shot(java.awt.Rectangle space, String fileName) throws AWTException, IOException
    {
        java.awt.image.BufferedImage imagen = (new java.awt.Robot().createScreenCapture(space));
        javax.imageio.ImageIO.write(imagen, "jpg", new java.io.File(fileName));
    }
    
    public static Graph<String> grafo;
    
}
