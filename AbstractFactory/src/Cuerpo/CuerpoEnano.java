/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuerpo;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class CuerpoEnano extends Cuerpo {

    private ImageIcon imagen;
    private String descripcion;

    public CuerpoEnano() {
        imagen = new ImageIcon(getClass().getResource("/img/CuerpoEnano.png"));
        descripcion = "<html><body>Seres de pequeño tamaño que"
                + " pueden cambiar <br> su estatura a voluntad</body></html>";
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
