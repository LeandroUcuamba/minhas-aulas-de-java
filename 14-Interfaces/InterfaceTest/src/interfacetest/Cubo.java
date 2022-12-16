/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetest;

/**
 *
 * @author Leandro Ucuamba
 */
public class Cubo implements VolumeCalculavel, AreaCalculavel {

    double lado;
    public Cubo(double lad){
        this.lado = lad;
    }
    
    
    @Override
    public double calculaVolume() {
      return 6*lado*lado;
    }

    @Override
    public double calculaArea() {
        return lado*lado*lado;
    }
    
}
