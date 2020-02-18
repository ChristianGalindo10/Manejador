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
public class Jpg implements Manejador {

    private Manejador next;
    
    @Override
    public void setNext(Manejador pManejador) {
        this.next = pManejador;
    }

    @Override
    public Manejador getManejador() {
        return this.next;
    }

    @Override
    public void leerImagen(String f) {
        if(f.equalsIgnoreCase("jpg")){
            System.out.println("Leído como jpg");
        }else{
            System.out.println("No se reconoce como formato jpg");
            this.next.leerImagen(f);
        }
    }
    
}
