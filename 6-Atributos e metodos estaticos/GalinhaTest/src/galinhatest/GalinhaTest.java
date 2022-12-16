/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galinhatest;

/**
 *
 * @author Leandro Ucuamba
 */
public class GalinhaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Galinha g1 = new Galinha();
        g1.botar().botar().botar();
        
        Galinha g2 = new Galinha();
        g2.botar().botar();
        
        System.out.println(g1.ovos);
        System.out.println(g2.ovos);
        System.out.println("O total de ovos e:"+Galinha.ovosDaGranja);
        System.out.println(Galinha.mediaDeOvos(2));
        
        
    }
    
}
