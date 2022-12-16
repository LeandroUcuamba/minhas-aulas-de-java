/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaoset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Leandro Ucuamba
 */
public class ColecaoSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] cores = {"verde","amarelo","azul","branco","azul","amarelo","verde"};
        
        List<String> lista = Arrays.asList(cores);
        
        Set<String> set = new HashSet<>(lista);
        System.out.println(set);
        
    }
    
}
