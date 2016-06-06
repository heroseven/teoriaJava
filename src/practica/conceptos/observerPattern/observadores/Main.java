/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern.observadores;


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
        Sujeto a = new Sujeto();
        Observador1 ob1= new Observador1(a);
        a.añadir(ob1);
        a.accion("tres");
        a.accion("dos");
    }
}
