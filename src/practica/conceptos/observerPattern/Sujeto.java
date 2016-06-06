/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephan
 */
public class Sujeto {
    
    private List<Observador> observadores= new ArrayList<Observador>();
    
    public void anadir(Observador observador){
        observadores.add(observador);
        
    }
    public void eliminar(Observador observador){
        observadores.add(observador);
        
    }
    
    public void notificarATodos(){
        for(Observador observador: observadores){
            observador.actualizar();
        }
    }
    
    public void cambiarEstado(){
        System.out.println("El sujeto a cambiado de estado");
        this.notificarATodos();
    }
    
    
    
    
}
