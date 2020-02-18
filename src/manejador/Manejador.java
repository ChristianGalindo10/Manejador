/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

/**
 *
 * @author USUARIO
 */
public interface Manejador {

    public void setNext(Manejador pManejador);
    public Manejador getManejador();
    public void leerImagen(String f);

}
