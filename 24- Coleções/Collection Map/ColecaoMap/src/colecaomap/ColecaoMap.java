/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaomap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Leandro Ucuamba
 */
public class ColecaoMap {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // um representa o tipo da chave e outro do valor ( Map<String, String> ).
        Map<String, String> pais = new HashMap<>();
        pais.put("BR", "Brasil");
        pais.put("RU", "Russia");
        pais.put("IN", "India");
        pais.put("CN", "China");
        
        System.out.println(pais);
        
        System.out.println(pais.containsKey("BR")); // busca o elemento com esta chave.
        System.out.println(pais.containsValue("India"));
        
        System.out.println(pais.get("CN")); // retorna o conteudo desta chave "no caso china".
        pais.remove("RU"); // remove o conteudo da chave, bem como a chave.
         
        System.out.println(pais);
        
        /* Agora veremos como se recupera todas as chaves da nossa colecao Map */
        
        Set<String> keys = pais.keySet();
        for(String chaves : keys){
            System.out.println(chaves);
            //ou 
            System.out.println(chaves + ":" + pais.get(chaves));
        }
         
    }
    
}
