/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern2;

/**
 *
 * @author stephan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sujeto a= new Sujeto();
        new Observador1(a);
        a.cambiarEstado();

    }
}
