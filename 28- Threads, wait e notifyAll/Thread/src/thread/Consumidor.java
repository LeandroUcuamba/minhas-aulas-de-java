/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Random;

/**
 *
 * @author Leandro Ucuamba
 */
public class Consumidor implements Runnable {

    private Ponte ponte;  //o primeiro "Ponte" é a interface;
    
    public Consumidor(Ponte ponte){
        this.ponte = ponte;
    }
    
    private Random aleatorio = new Random();
    
    
    
    @Override
    public void run() {
        int total=0;
       for(int i=0; i<5; i++)
       {
           try {
                 Thread.sleep(aleatorio.nextInt(3000));
                 total += ponte.get();
                 System.err.println("\t" + total);
               } 
           catch (InterruptedException ex) {}
           
                
       }
    }
    
}
