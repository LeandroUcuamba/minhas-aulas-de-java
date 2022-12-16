/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaleandro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import poo.Conta;

/**
 *
 * @author Leandro Ucuamba
 */
public class Arquivo3 {
    
    Path caminho = Paths.get("C:/xti/files/contas.txt");
    Charset utf8 = StandardCharsets.UTF_8;
    
   public void armazenarContas(ArrayList<Conta> cd) throws IOException
    {
        try(BufferedWriter escritor = Files.newBufferedWriter(caminho, utf8))
          {
            for (Conta kkconta : cd) 
              {
                 escritor.write(kkconta.getCliente() + ";" + kkconta.getSaldo()); //como os atributos nao estao visiveis vou ir criar os metodos get e set.
              }
           
          }
    }
    
    public ArrayList<Conta> recuperarContas() throws IOException, NumberFormatException
    {
        ArrayList<Conta> contaBB = new ArrayList<>();
        
        try( BufferedReader leitor = Files.newBufferedReader(caminho, utf8) )
        {
            String line = null;
            while((line = leitor.readLine()) != null)
             { 
                String[] t = line.split(";");
                Conta ppp = new Conta(t[0],Double.parseDouble(t[1]));
                contaBB.add(ppp);
             }
        }
       return contaBB; 
    }
    
     
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ArrayList<Conta> contas = new ArrayList<>();
        
        // Conta c1 = new Conta();
        // c1.
        /* Neste momento eu nao consigo acessar o atributos nem os metodos da classe "Conta" pk nao 
        usei nenhum modificador, entao irei usar modificadores na classe Conta.*/
         contas.add(new Conta("Ricardo",12000.23));
         contas.add(new Conta("Lawrence",11050.32));
         contas.add(new Conta("Sandra",18000.21));
         contas.add(new Conta("Beatriz",23200.09));
         
         Arquivo3 operacao = new Arquivo3();
         operacao.armazenarContas(contas);
         ArrayList<Conta> conta2 = operacao.recuperarContas();
           for (Conta OO : conta2) {
                OO.exibeSaldo();
            }
        
         
    }
    
}
