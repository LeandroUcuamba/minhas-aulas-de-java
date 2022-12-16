/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import poo.Conta; // importei a classe conta que esta no pacote poo.

/**
 *
 * @author Leandro Ucuamba
 */
public class Conta {
    
    private String cliente;
    private double saldo;
    
    public Conta(){}
    public Conta(String cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
        
    }
    
    public String getCliente()
    {
        return cliente;
    }
    
    public double getSaldo()
    {
        return saldo;
    }
    
    
    public void exibeSaldo(){
        System.out.println(cliente + "o seu saldo e:" + saldo);
    }
    
    public void saca(double valor){
        saldo -=valor;
        /* saldo = saldo - valor; */
    }
    
    public void deposita(double valor){
        saldo +=valor;
        /* saldo = saldo + valor; */
    }
    
    public void transferePara(Conta destino, double valor){
        
        this.saca(valor);
        destino.deposita(valor);
        
    }
    
    
}
