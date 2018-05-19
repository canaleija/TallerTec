/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import static herramientas.Iluminacion.validaRango;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Temperatura {
    
    public static Image modificarTemperatura (Image imagenOriginal, int valor){
    
         BufferedImage bfi = IOImage.toBufferedImage(imagenOriginal);
        // recorrer la imagen por renglones y columnas
        for (int x=0; x<bfi.getWidth();x++){
            for(int y =0; y<bfi.getHeight();y++){
                 Color pixel = new Color(bfi.getRGB(x, y));
                 int nRojo = pixel.getRed()+valor;
                 int nVerde = pixel.getGreen();
                 int nAzul = pixel.getBlue()-valor;
                 pixel = new Color(validaRango(nRojo),validaRango(nVerde), validaRango(nAzul));
                 bfi.setRGB(x, y, pixel.getRGB());
                }
             
            }
          return IOImage.toImage(bfi);
        }
    
}
