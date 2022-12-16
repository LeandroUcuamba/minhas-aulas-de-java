/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaoutilitario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Leandro Ucuamba
 */
public class ColecaoUtilitario {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> lista = new ArrayList();
        lista.add("Guarana");
        lista.add("Uva");
        lista.add("Manga");
        lista.add("Coco");
        lista.add("Acai");
        lista.add("Banana");
        System.out.println(lista);
        
        /* Agora aonde entra esta classe utilitaria collection */
        /* a collection ela foi criada para a manipulação de todas as coleções em java. No
        entanto existem alguns metodos que so funcionam nesta classe Collections */
        
        Collections.sort(lista); // serve para ordenar os elementos em ordem alfabetica;
        System.out.println(lista);
        
        Collections.reverse(lista); // aqui ele faz de ordem inversa;
        System.out.println(lista);
        
        Collections.shuffle(lista); // esse metodo ele embaralha os elementos da coleção;
        System.out.println(lista);
        
        Collections.addAll(lista, "Cupuaçu","Laranja","Laranja"); // add novos elementos na coleção;
        System.out.println(lista);
        
        System.out.println(Collections.frequency(lista, "Laranja")); // O numero de vezes que a palvra laranja aparece;
        
    }
    
}
