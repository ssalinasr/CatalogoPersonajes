/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escudo;

import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class EscudoEnano extends Escudo {

    private ImageIcon imagen;

    private String descripcion;

    public EscudoEnano() {
        imagen = new ImageIcon(getClass().getResource("/img/EscudoEnano.png"));
        descripcion = "<html><body>Un escudo circular de materiales pesados, <br>"
                + "portable"
                + " en"
                + " una sola mano</body></html>";
    }

    @Override
    public String getEscudo() {
        return descripcion;
    }

    @Override
    public ImageIcon getEscudoI() {
        return imagen;
    }

}
