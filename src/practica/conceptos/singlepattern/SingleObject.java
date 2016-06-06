/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.singlepattern;

/**
 *
 * @author stephan
 */
public class SingleObject {
    
    
    //crear un objeto del tipo SingleObject
    private static SingleObject instance= new SingleObject();
    private int a;
    //crear constructor privado
    private SingleObject(){
        
    }
    
    //obtener la unica instancia disponible
    public static SingleObject getInstance(){
        return instance;
    }
    //
    public void mostrarMensaje(){
        System.out.println("Un método de la clase que se puede instanciar una sola vez"+Math.random());
    }
    
    
    
}
