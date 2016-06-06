package practica.conceptos.exceptions;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author stephan
 */
public class BankDemo {
    public static void main(String [] args) throws InsufficientFundsException 
   {
      //101 es la # de cuenta y no el saldo en la cuenta
      CheckingAccount c = new CheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
       System.out.println(c.getBalance());
      
     
         System.out.println("\nWithdrawing $100...");
         c.withdraw(600.00);
        
     
    }
}
