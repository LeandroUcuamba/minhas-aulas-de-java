/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro Ucuamba
 */
public class ColecaoList {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> lista = new ArrayList();
        lista.add("Futebol");
        lista.add("Basquete");
        lista.add("Tenis");
        lista.add("Voley");
        lista.add("Natação");
        lista.add("Hockey");
        lista.add("Boxe");
        lista.add("Futebol");
        System.out.println(lista);
        
        /* Listar os elementos de uma coleção List */
        
        for(int i=0; i < lista.size() ; i++){
            String letra = lista.get(i);
            lista.set(i, letra.toUpperCase()); // para listar em letras maiusculas;
        }
        
        System.out.println(lista);
        
        System.out.println(lista.indexOf("BOXE")); //posicao que se encontra a palavra BOXE.
        System.out.println(lista.subList(2,4)); // seleciona os elementos entre posições.
        /* lista.subList(2,4).clear(); -> limpa os elementos entre as posições definidas */
        
        
    }
    
}
