/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern;

import practica.conceptos.observerPattern.Observador;
import practica.conceptos.observerPattern.Sujeto;

/**
 *
 * @author stephan
 */
public class Observador2 extends Observador{
    
    public Observador2 (Sujeto sujeto){
        this.sujeto= sujeto;
        sujeto.anadir(this);
    }
    
    @Override
    public void actualizar(){
        System.out.println("El observador2 a recibido la notificación de cambio");
    }
}
