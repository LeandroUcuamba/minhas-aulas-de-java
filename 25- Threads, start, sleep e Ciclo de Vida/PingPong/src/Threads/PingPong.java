/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro Ucuamba
 */
public class PingPong extends Thread {

    String palavra;
    long tempo;
    
    public PingPong(String palavra, long tempo){
        this.palavra = palavra;
        this.tempo = tempo;
    }
    
    
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
        
        /* Com o new PingPong("Ping",1500) é o suficiente para criar uma nova Thread */
        /* Mas para deixar no estado 'pronto para ser executado' é necessario o metodo start() */
        /* Apois este estado o JVM vai executar o metodo run() desta Thread */
        new PingPong("Ping",1500).start(); // vai imprimir a palavra Ping em 1,5 segundos. 
        new PingPong("Pong",2000).start(); // a mesma coisa em 2 segundos.
        
        // se compilar sem o metodo run() ele não apresenta nehuma palavra.
        
        
        System.out.println("Ver Thread");
        
    }
    
}
