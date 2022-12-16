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
public class PonteSincronizada implements Ponte {

    private int valor = -1;
    private boolean ocupada = false;
    
    
    @Override
    public synchronized void set(int valor) throws InterruptedException {
        while(ocupada){
            System.out.println("Ponte cheia. Produtor aguarda!");
            wait(); // da classe object, este metodo faz com que a Thread que esta a executar este metodo aguarde;
            // este metodo não pode ser executado enquanto a ponte estiver ocupada.
        }
        
        System.out.println("Produziu" + valor);
        this.valor = valor;
        
        ocupada = true;
        notifyAll(); 
 // serve para notificar as outras Threads que estão aguardando a liberação ou a modificação do status desta ponte "ocupada = true;" para continuar sua execução.
    }

    @Override
    public synchronized int get() throws InterruptedException {
        
        while(!ocupada){
            System.out.println("Ponte vazia. Consumidor aguarda.");  
            wait();
        }
        
        System.err.println("Consumiu" + valor);
        ocupada = false;
        notifyAll();
        return valor;
    }
    
    
    
}
