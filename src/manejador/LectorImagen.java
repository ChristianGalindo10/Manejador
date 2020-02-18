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
public class LectorImagen {
    
    public static void main(String[] args){
        Imagen imagen = new Imagen();
        
        imagen.leerImagen("gif");
        imagen.leerImagen("jpg");
        imagen.leerImagen("Png");
    }
}
