/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronMVC;

/**
 *
 * @author stephan
 */
public class RemachadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       RemachadoraModelo remamo=obtenerRechamadora();
       
       
       RemachadoraVista remavi= new RemachadoraVista();
       
       RemachadoraControlador remaco= new RemachadoraControlador(remamo,remavi);
       
       
       remaco.actualizarVista();
       remaco.setTipo("2015");
       remaco.actualizarVista();
       
        
    }

    private static RemachadoraModelo obtenerRechamadora() {
        RemachadoraModelo remamo= new RemachadoraModelo();
        remamo.setTipo("2014");
        remamo.setPrecio(1220);
        
        return remamo;
    }
}
