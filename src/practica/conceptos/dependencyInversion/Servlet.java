/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.dependencyInversion;

/**
 *
 * @author stephan
 */
public class Servlet{
        public Gestor gestor;
        
        public void verificarUsuario() {
        
        System.out.println("Verifiando usuario de base de datos en base "+gestor.basededatos(null) );
        
    }
    
    
    
    
}
