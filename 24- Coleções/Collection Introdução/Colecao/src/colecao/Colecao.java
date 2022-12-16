/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author Leandro Ucuamba
 */
public class Colecao {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Collection<String> c = new ArrayList(); // conversao de array em colecão.
        c.add("A");
        c.add("E");
        c.add("I");
        System.out.println(c.toString());  // toString ele mostra os elementos em ordem;
        System.out.println(c.isEmpty()); // pergunta se esta vazio o array;
        System.out.println(c.contains("A")); // pergunta se contem o A;
        
        c.remove("A"); 
        System.out.println(c.toString());
        
        /* GRUPOS */
        
        Collection<String> c2 = Arrays.asList("O","U");
        c.addAll(c2); // acrescenta os elementos do objecto c2 no c;
        System.out.println(c.toString());
        System.out.println(c.containsAll(c2)); // verifica se estao todos elementos da colecao c2 na colecao c;
        // O metodo removeAll -> remove todos os metodos de uma certa colecao;
        
        /* PERCORRER OS ELEMENTOS DE UMA COLECAO */
        
        for(String recebe: c){
            System.out.println(recebe);
        }
        
        
        /* converter uma colecão em array */
        
        String[] s = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(s));
        
        
        // metodo clear() -> serve para limpar toda a colecao;
    }
    
}
