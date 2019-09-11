/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuerpo;

import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class CuerpoElfo extends Cuerpo {

    private ImageIcon imagen;
    private String descripcion;

    public CuerpoElfo() {
        imagen = new ImageIcon(getClass().getResource("/img/CuerpoElfo.png"));
        descripcion = "<html><body>"
                + "Posee una gran destreza con la magia y una fuerza superi"
                + "or a los humanos.</body></html>";
    }

    @Override
    public String getCuerpo() {
        return descripcion;
    }

    @Override
    public ImageIcon getCuerpoI() {
        return imagen;
    }

}
