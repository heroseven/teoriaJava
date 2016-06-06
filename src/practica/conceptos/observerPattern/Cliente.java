/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern;

import practica.conceptos.observerPattern.observadores.Observador1;

/**
 *
 * @author stephan
 */
public class Cliente {
    private static Observador o;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sujeto sujeto = new Sujeto();
     
        new Observador2(sujeto);
        
        
        sujeto.cambiarEstado();
        
        
        
        
    }
}
