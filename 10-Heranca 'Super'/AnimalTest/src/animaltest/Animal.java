/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaltest;

/**
 *
 * @author Leandro Ucuamba
 */
public class Animal {
    
    double peso;
    String comida;
    
    public Animal(double peso, String comida){
        this.peso=peso;
        this.comida=comida;
    }
    
    void dormir()
    {
        System.out.println("dormiu");
    }
    
    void fazerBarulho()
    {
        System.out.println("huhuhuh");
    }
    
    
}
