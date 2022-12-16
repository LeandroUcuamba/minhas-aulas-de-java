/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetest;

/*
 * @author Leandro Ucuamba
 */
public class Quadrado implements AreaCalculavel {
    
    double lado;
    public Quadrado(double lad){
        this.lado = lad;
    }
    
    @Override
    public double calculaArea(){
        return lado*lado;
    }
    
}
