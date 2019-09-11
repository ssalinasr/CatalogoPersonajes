/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arma;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class ArmaEnano extends Arma {

    private ImageIcon imagen;
     
    
    private String descripcion; 

    public ArmaEnano() {
       imagen = new ImageIcon(getClass().getResource("/img/ArmaEnano.png"));
       descripcion = "<html><body>Arma metálica de gran tamaño, que realiza cortes "
               + "<br>"
               + "mediante golpes </body></html>";
    }



    @Override
    public String getArma() {
        return descripcion;
    }

    @Override
    public ImageIcon getArmaI() {
        return imagen;
    }
    
    
    
}
