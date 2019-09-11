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
public class EscudoHumano extends Escudo {

    private ImageIcon imagen;
    private String descripcion;

    public EscudoHumano() {
        imagen = new ImageIcon(getClass().getResource("/img/EscudoHumano.png"));
        descripcion = "<html><body>Dos elementos diseñados para repeler el daño provocado"
                + " <br>"
                + "por agentes externos, como las balas</body></html>";
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
