/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideporzero;

import java.util.Scanner; 
import java.util.InputMismatchException;

public class DividePorZero {

    public static void main(String[] args) {
        // TODO code application logic here
          
         
        Scanner s = new Scanner(System.in);
        boolean continua = true;
        
        do{
            
       try{ 
            System.out.println("Numero: ");
            int a = s.nextInt();
            System.out.println("Divisor: ");
            int b = s.nextInt();
        
            System.out.println(a / b);
            continua =false;
         }
       catch(InputMismatchException e1) 
         {
           System.out.println("Capturei erro InputMismatchException");
           s.nextLine(); // descarta a entrada que deu erro e solicita a entrada outra vez         }
            
        } 
       
        finally{
           System.out.println("Finally executou"); // independentemente de qualquer coisa acima 'erro ou nao' o finally executa;
        }
       
        } while(continua);
        
        
     
     
     
    }
     
   }

