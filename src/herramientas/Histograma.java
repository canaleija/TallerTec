/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Histograma {
  
    public static double[] calculaHistograma(Image imagen,int color){

        double histograma[] = new double[256];
        
        BufferedImage bfi = IOImage.toBufferedImage(imagen);
        // recorrer la imagen por renglones y columnas
        for (int x=0; x<bfi.getWidth();x++){
            for(int y =0; y<bfi.getHeight();y++){
                 Color pixel = new Color(bfi.getRGB(x, y));
                switch(color){
                   // agregamos rojo
                    case 0: {
                    histograma[pixel.getRed()]++;
                    break;
                    }
                  // agregamos verde
                    case 1: {
                    histograma[pixel.getGreen()]++;
                    break;
                    }
                  // agregamos rojo
                    case 2: {
                    histograma[pixel.getBlue()]++;
                    break;
                    }
                               
                }
             
            }
        
        }
    return histograma;
    }
}
