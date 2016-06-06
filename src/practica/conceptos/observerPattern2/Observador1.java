/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern2;

/**
 *
 * @author stephan
 */
public class Observador1 extends Observador{
    private  Sujeto sujeto;
    
    
    public Observador1(Sujeto sujeto) {
        this.sujeto=sujeto;
        sujeto.anadir(this);
    }
    
    public void actualizar(){
        System.out.println("se notifica a observador1");
    }
    
}
