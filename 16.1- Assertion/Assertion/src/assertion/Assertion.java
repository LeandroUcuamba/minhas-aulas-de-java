/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertion;
import java.util.Scanner;

/**
 *
 * @author Leandro Ucuamba
 */
public class Assertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner k = new Scanner(System.in);
        System.out.println("Entre com um numero de 0 a 10");
        int numero = k.nextInt();
        
        
        assert(numero >= 0 && numero <= 10) : "numero invalido" + numero; 
        System.out.println("Voce entrou com numero:" + numero);
        
    }
    
}
