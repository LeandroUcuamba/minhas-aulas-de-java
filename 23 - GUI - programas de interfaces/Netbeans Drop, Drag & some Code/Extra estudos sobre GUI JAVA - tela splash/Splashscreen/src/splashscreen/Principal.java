/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashscreen;

/**
 *
 * @author Leandro Ucuamba
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Telascreen s = new Telascreen();
        s.setVisible(true);
        
        // Controle do progressBar e Jlabel contando;
        try{
             for(int i=0; i<=100; i++)
               {
                 Thread.sleep(50);
                 s.jLabel3.setText(Integer.toString(i)+"%");
                 s.jProgressBar1.setValue(i);
                 
                  if(i==100)
                  {
                     s.setVisible(false);
                     
            
                new proximo().setVisible(true);
            
                     
                  }
                
               }
        
           } catch(Exception e){
            
              }
        
        
        
    }
    
}
