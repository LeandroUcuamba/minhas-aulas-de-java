/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetest;


public class InterfaceTest {

    public static void area(AreaCalculavel o){
        System.out.println(o.calculaArea());
    }
    
    public static void volume(VolumeCalculavel o){
        System.out.println(o.calculaVolume());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        area(new Quadrado(2));
        volume(new Cubo(2));
    }
    
}
