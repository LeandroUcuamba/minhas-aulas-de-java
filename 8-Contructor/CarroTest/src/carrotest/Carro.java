/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrotest;

/**
 *
 * @author Leandro Ucuamba
 */
public class Carro {
    
    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    
    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
    }

    /* Se nao criar isto o constructor nao funciona */
    public Carro() {
        
    }
    
}
