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
       catch(InputMismatchException | ArithmeticException e1) //estamos perante a um multi-cast
         {
           System.err.println("Numero invalido"); // Aqui eu vou informar independente se for 0 ou formato - na mesma e invalido.
           e1.printStackTrace(); // este metodo vai imprimir a pilha de erro encontrada nesta excessao.
           s.nextLine(); // descarta a entrada que deu erro e solicita a entrada outra vez         }
            
        } 
       
        finally{
           System.out.println("Finally executou"); // independentemente de qualquer coisa acima 'erro ou nao' o finally executa;
        }
       
        } while(continua);
        
        
     
     
     
    }
     
   }

