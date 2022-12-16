/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galinhatest;

   

   public class Galinha {
       
       public static int ovosDaGranja; /* Variavel global */
    
       public int ovos;  /* Total de ovos do objeto galinha */
    
       public Galinha botar(){
        
        this.ovos++; /*sem incrementar nao funciona*/
        Galinha.ovosDaGranja++;  /*sem incrementar nao funciona*/
        return this;
        
      }
       
       public static double mediaDeOvos (int galinhas){
            return Galinha.ovosDaGranja / galinhas;
           
       }
    
    
   }
