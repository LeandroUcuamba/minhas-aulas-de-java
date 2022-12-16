/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Leandro Ucuamba
 */
public class PonteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ponte ponte = new PonteSincronizada();
        new Thread(new Produtor(ponte)).start();
        new Thread(new Consumidor(ponte)).start();
        
    }
    
}
