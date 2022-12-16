/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Leandro Ucuamba
 */
public class PingPongRunnable implements Runnable { // ao inves da classe Thread, implementei uma interface Runnable.

    
    String palavra;
    long tempo;
    
    public PingPongRunnable(String palavra, long tempo){
        this.palavra = palavra;
        this.tempo = tempo;
    }
    
    
    @Override
    public void run(){
        
            try {
                 for(int x=0; x<5; x++){
                 System.out.println(palavra);
                 Thread.sleep(tempo);
                }
               } 
            catch (InterruptedException ex) {
               return;
            }
        }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       Runnable ping = new PingPongRunnable("Ping",1500);
       Runnable pong = new PingPongRunnable("Pong",2000);
        
       /* Como executar os objectos ping & pong */
        
       new Thread(ping,"ping").start();
       new Thread(pong,"ping").start();
       
        System.out.println("Ver Thread");
        
    }
    
}
