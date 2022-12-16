/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacaotest;

/**
 *
 * @author Leandro Ucuamba
 */
public class Soma extends OperacaoMatematica {
    
    
    /* Aqui estamos perante a uma sobreescrita de metodo "porque este metodo ja foi escrito na classe OperacaoMatematica apenas mudou o retorno" */
     public double calcular(double x, double y){
        return x+y;
    }
}
