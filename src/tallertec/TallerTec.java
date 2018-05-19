/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallertec;

import gui.JFrameImagen;
import herramientas.Grafica;
import herramientas.Histograma;
import herramientas.IOImage;
import java.awt.Image;

/**
 *
 * @author Roberto Cruz Leija
 */
public class TallerTec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image imagenOriginal = IOImage.abrirImagen();
        //JFrameImagen frame = new JFrameImagen(imagenOriginal);
        //frame.setVisible(true);
        double[] hRojo = Histograma.calculaHistograma(imagenOriginal, 0);
        double[] hVerdes = Histograma.calculaHistograma(imagenOriginal, 1);
        double[] hAzul = Histograma.calculaHistograma(imagenOriginal, 2);


        Grafica grafica = new Grafica("Tono","Frecuencia","Frecuencias");
        grafica.agregarSerie("Roja", hRojo);
       
        grafica.agregarSerie("Azul", hAzul);
         grafica.agregarSerie("Verde", hVerdes);
        grafica.crearYmostrarGrafica();
        
    }
    
}
