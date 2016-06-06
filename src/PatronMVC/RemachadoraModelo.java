/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronMVC;

/**
 *
 * @author stephan
 */


/*este clase tiene la logica de la aplicación*/
public class RemachadoraModelo {
    String tipo;
    int precio;

    public RemachadoraModelo() {
    }

    public RemachadoraModelo( String tipo, int precio) {
       
        this.tipo = tipo;
        this.precio = precio;
    }

   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
}
