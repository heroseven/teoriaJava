/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.intefaces;

import practica.conceptos.intefaces.intefaz.Servicio;


/**
 *
 * @author stephan
 */
public class Activity {
    
//   public void logica(){
//       Servicio a= new Gestor();
//       a.procesoServicio();
//   }
    private Servicio implementacion1;  
    
    
    public Activity(Servicio servicio){
        this.implementacion1= servicio;
        this.metodo();
    }

    public void metodo(){
        implementacion1.procesoServicio();
    }
   
}
