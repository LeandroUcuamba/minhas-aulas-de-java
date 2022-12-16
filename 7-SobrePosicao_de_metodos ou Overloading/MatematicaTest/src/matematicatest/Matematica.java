/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicatest;

/**
 *
 * @author Leandro Ucuamba
 */
public class Matematica {
    
    double soma (double ... numeros){
        double total = 0;
        for(double n : numeros){
            total += n;
        }
        return total;
    }
    
    /* Metodos media  */
    /* Estes metodos todos possuem as mesma funcao de achar media */
    /* Agora SobrePosicao_de_metodos ou metodos sobrecarregados 'overloading' -> é criar metodos com
    diferentes parametros porem que fazem a mesma coisa.*/
    
    double media (int x ){
        System.out.println("media (int x)");
        return x;
    }
    
    
    double media (int x , int y){
        System.out.println("media (int x , int y)");
        return (x+y)/2;
    }
    
    double media (double ... numeros){
        System.out.println("media (int ... numeros)");
        return this.soma(numeros)/numeros.length;
    }
    
    double media (String x , String y){
        System.out.println("media (String x , String y)");
        int ix = Integer.parseInt(x);
        int iy = Integer.parseInt(y);
        return (ix+iy)/2;
    }
    
    
}
