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
public interface Ponte {
    
    public void set(int valor) throws InterruptedException;
            
    public int get() throws InterruptedException;
    
    
}
