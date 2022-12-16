/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicatest;

/**
 *
 * @author Leandro Ucuamba
 */
public class MatematicaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematica m = new Matematica();
        
        /* O exemplo abaixo independente do quantidade de valores do parametro que nos queremos calcular ele vai 
        buscar pk na classe Matematica criamos varios 'metodos media' ele escolhe o melhor caminho para fazer o calculo */
        
        System.out.println(m.media(5));
        System.out.println(m.media(5, 3));
        System.out.println(m.media(5, 3, 3, 6));
        System.out.println(m.media("7", "9"));
        System.out.println(m.media("11", "2"));
                        
        
    }
    
}
