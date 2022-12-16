/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrotest;

/**
 *
 * @author Leandro Ucuamba
 */
public class CarroTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* Carro ferrari = new Carro();
        ferrari.modelo = "Enzo";
        ferrari.velocidadeMaxima = 300;
        ferrari.segundosZeroACem = 3.2;
        */
        
        Carro ferrari = new Carro("ferrari_Lk", 300, 3.2);
        System.out.println(ferrari.modelo + ferrari.velocidadeMaxima + ferrari.segundosZeroACem);
        
    }
    
}
