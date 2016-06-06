/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.observerPattternInterfaz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephan
 */
public class Sujeto {
    
    protected Observador1 observador;
    
    public void anadir(Observador1 observador){
        this.observador=observador;
        
    }
    public void notificar(){
        observador.mensaje();
    }
    
    
    public void movimiento(){
        this.notificar();
       
    }
}
