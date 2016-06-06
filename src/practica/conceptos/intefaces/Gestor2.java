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
public class Gestor2 implements Servicio{

    @Override
    public void procesoServicio() {
        System.out.println("Proceso de la implementacion2");
    }
    
}
