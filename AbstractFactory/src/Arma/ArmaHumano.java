/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arma;

import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class ArmaHumano extends Arma {

    private ImageIcon imagen;
    private String descripcion;

    public ArmaHumano() {
        imagen = new ImageIcon(getClass().getResource("/img/ArmaHumano.png"));
        descripcion = "<html><body>Arma de fuego diseñada para apuntar y disparar a <br>"
                + "corta"
                + "distancia</body></html>";
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
