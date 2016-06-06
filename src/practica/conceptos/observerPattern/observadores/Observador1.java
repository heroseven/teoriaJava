/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern.observadores;


/**
 *
 * @author stephan
 */
public class Observador1 implements Observador{
    private final Sujeto sujeto;
    
    public Observador1(Sujeto sujeto) {
    this.sujeto=sujeto;    
    }

    @Override
    public void actualizar() {
        System.out.println("observador 1 se enteró, la variable ahora es: "+sujeto.variable);   
    }

   
   
    
    
    
    
}
