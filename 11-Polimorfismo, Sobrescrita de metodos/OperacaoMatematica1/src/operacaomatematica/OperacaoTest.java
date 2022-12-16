/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacaomatematica;

/**
 *
 * @author Leandro Ucuamba
 */
public class OperacaoTest {
    
    
    public static void calcule(OperacaoMatematica o, double x, double y){
        
        System.out.println(o.Calcular(x, y));
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        calcule(new Soma(), 5,5);
        calcule(new Multiplicacao(), 5,5);
        
        
    }
    
}
