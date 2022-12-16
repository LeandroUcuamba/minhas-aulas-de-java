/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Leandro Ucuamba
 */
public class PonteNaoSincronizada implements Ponte {

    private int valor = -1;
    
    @Override
    public void set(int valor) throws InterruptedException {
        System.out.println("Produziu" + valor);
        this.valor = valor;
    }

    @Override
    public int get() throws InterruptedException {
        System.err.println("Consumiu" + valor);
        return valor;
    }
    
    
    
}
