/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephan
 */
public class Sujeto {
    
    protected List<Observador> observadores= new ArrayList<Observador>();
    public void anadir(Observador observador){
       
            observadores.add(observador);
        
        
    }
    public void eliminar(){
        
    }
    
    public void notificarATodos(){
         for(Observador observador : observadores){
            observador.actualizar();
         }
    }
    
    public void cambiarEstado(){
        System.out.println("cambio el sujeto");
        this.notificarATodos();
    }
    
    
}
