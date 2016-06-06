/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattternInterfaz;

/**
 *
 * @author stephan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        Sujeto a= new Sujeto();
        a.anadir(new Observador1());
        a.movimiento();
        
        
    }
}
