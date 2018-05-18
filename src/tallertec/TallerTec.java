/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallertec;

import gui.JFrameImagen;
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
        JFrameImagen frame = new JFrameImagen(imagenOriginal);
        frame.setVisible(true);
        System.out.println();
    }
    
}
