/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.conceptos.tryandcatch;

/**
 *
 * @author stephan
 */
public class PracticandoTeoría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int a[] = new int[2];
      
         
         try{
             System.out.println("Access element three :" + a[3]);
         }catch(Exception e){
             //tambien funciona si le ponemos ArrayIndexOutOfBoundsException
            System.out.println(e);
         }finally{
             System.out.println("Continuar lógica luego de capturar error.");
         }
      
        
        
    }
}
