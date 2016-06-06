/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.singlepattern;

/**
 *
 * @author stephan
 */
public class Clase {
    //crear un objeto
    private static Clase instancia= new Clase();
    //crear constructor privado
    private Clase(){
        
    }
    //obtener unica instancia
    public static Clase obtenerInstancia(){
        return instancia;
    }
    public void metodo(){
        System.out.println("hola");
    }
}
