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
public class ContaConjunta {
    
    private int saldo = 100;
    
    
    public int getSaldo(){
        return saldo;
    }
    
    
    public synchronized void sacar(int valor, String cliente)
    {
        if(saldo >= valor)
        {
            int saldoOriginal = saldo;
            
            System.out.println(cliente + " vai sacar");
           
            try { 
                System.out.println(cliente + " Esperando");
                Thread.sleep(1000); // aguardando processamento.
            } catch (InterruptedException ex) {}
                saldo -= valor; // saldo = saldo - valor;
                String sms = cliente + " Sacou " + valor 
                + "[Saldo Original= " + saldoOriginal + ", Saldo Final= " + saldo + "]" ;
                System.out.println(sms);
                
        } 
        else{
            System.out.println("Saldo insuficiente para " + cliente);
        }
        
    }
    
    
}
