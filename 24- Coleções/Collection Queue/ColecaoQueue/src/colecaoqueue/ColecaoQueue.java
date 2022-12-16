/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaoqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Leandro Ucuamba
 */
public class ColecaoQueue {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Queue<String> fila = new LinkedList();
        fila.add("Ricardo");
        fila.add("Sandra");
        fila.add("Beatriz");
        
        System.out.println(fila);
        
        System.out.println(fila.peek()); // apresenta o primeiro da fila "no caso ricardo" mas nao remove nenhum outro elemento da fila.
        System.out.println(fila.poll()); // ja este metodo remove o primeiro da fila "no caso Ricardo".
        System.out.println(fila);
        
        /* Outros metodos disponiveis em LinkedList */
        LinkedList<String> f = (LinkedList<String>) fila; 
        f.addFirst("Caio"); // colocou no inicio da fila;
        f.addLast("Juliana"); // colocou no fim da fila;
        
        System.out.println(f);
        
        
         System.out.println(f.peekFirst()); // apresenta o primeiro da fila;
         System.out.println(f.peekLast()); // apresenta o ultimo da fila;
         System.out.println(f.pollFirst()); // remove o primeiro da fila;
         System.out.println(f.pollLast()); // remove o ultimo da fila;
        
         
         System.out.println(f);
    }
    
}
