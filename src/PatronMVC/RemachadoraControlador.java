/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronMVC;

    

    
    
    
/**
 *
 * @author stephan
 */
public class RemachadoraControlador {

    private RemachadoraModelo modelo;
    private RemachadoraVista vista;
    
    public RemachadoraControlador(RemachadoraModelo remano, RemachadoraVista remavi){
        this.modelo=remano;
        this.vista=remavi;
    }
    public String getTipo(){
        return modelo.getTipo();
    }
    public int getPrecio(){
        return modelo.getPrecio(); 
    }
    
    public void actualizarVista(){
        
        vista.imprimirDetallesRemachadora(modelo.getTipo(), modelo.getPrecio());
        
    }
    public void setTipo(String tipo){
        modelo.setTipo(tipo);
    }
    public void setPrecio(int precio){
        modelo.setPrecio(precio);
    }
    
    
    
    
    
    
    
    
}

