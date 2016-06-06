/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.singlepattern;

/**
 *
 * @author stephan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        SingleObject objeto= SingleObject.getInstance();
        objeto.mostrarMensaje();
        SingleObject c= SingleObject.getInstance();
        c.mostrarMensaje();
        
    }
}
