/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividirporzero;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Leandro Ucuamba
 */
public class DividirPorZero {

    public static void dividir(Scanner l) throws InputMismatchException, ArithmeticException
    {
                System.out.println("Numero:");
                int a = l.nextInt();
                System.out.println("Divisor:");
                int b = l.nextInt();
        
        
                System.out.println(a/b);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner k = new Scanner(System.in);
        
        boolean continua = true;
        
        do{
             try{
          
                dividir(k);
                continua = false;
                
                
               }
             
             
             catch(InputMismatchException | ArithmeticException e1){
             System.out.println("capturei um erro InputMismatchException ou ArithmeticException");
             System.out.println("o numero deve ser inteiro e o denominador > 0\n");
             k.nextLine();
              }
             
        } while(continua);
        
     
      
    }
    
}
