/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattern.observadores;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author stephan
 */
public class Sujeto {
    public String variable="uno";
    List<Observador> observadores= new ArrayList<Observador>();
    
    public void añadir(Observador observador){
        observadores.add(observador);
    }
    public void notificar(){
        for(Observador observador : observadores){
            observador.actualizar();
        }
    }
    public void accion(String valor){
        variable=valor;
        System.out.println("accion");
        this.notificar();
    }

    
}
