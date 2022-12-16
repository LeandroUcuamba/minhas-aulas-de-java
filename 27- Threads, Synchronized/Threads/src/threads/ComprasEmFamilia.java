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
public class ComprasEmFamilia implements Runnable {

    ContaConjunta conta = new ContaConjunta();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
        
       new Thread(irAsCompras, "pai").start(); // nome desta Thread é 'Pai'; 
       new Thread(irAsCompras, "Mãe").start(); // nome desta Thread é 'Mãe';
       new Thread(irAsCompras, "Filha").start(); // nome desta Thread é 'Filha';
       new Thread(irAsCompras, "Babá").start(); // nome desta Thread é 'Babá';
       
    }

    // assim ela cria as Threads e mata;
    // é o nosso metodo Run() que vai levar estas pessoas as compras;
    
    @Override
    public void run() {
        String cliente = Thread.currentThread().getName(); // currentThread() -> pega a Thread em exeução e getName() pega o nome desta Thread. 
        for(int i=0; i<5 ; i++)
        {
           conta.sacar(20, cliente); // cada pessoa vai sacar 20 do dinheiro.
           if(conta.getSaldo() <= 0 )
            {
               System.out.println("A conta estorou...");
            }
        
        }
    }
    
}
