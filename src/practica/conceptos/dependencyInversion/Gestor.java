/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.dependencyInversion;

/**
 *
 * @author stephan
 * Este método es el que no se implementaría en detalle sino que sería harccodeado.
 * Retorna una lista de perros.
 */
public class Gestor {
    
    public String basededatos(IntefaceGestor intefaceGestor){
        
        System.out.println("Médoto que devuelve una lista de perros hardcoedada");
        return null;
    }
    
}
