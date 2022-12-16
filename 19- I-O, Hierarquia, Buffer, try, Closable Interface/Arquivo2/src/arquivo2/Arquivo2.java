/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Leandro Ucuamba
 */
public class Arquivo2 {

    /*Na aula passada falamos sobre stream de bytes que é usado para escrever e ler ficheiros pequenos
     e sao interpretados para nao sao escritos por linguagens nao inteligiveis por humanos */
    
    /* Já o stream de caracters é o oposto */
    
    public static void main(String[] args) throws IOException { // esta excessao foi lancado, depois vamos tratar com o try & catch;
        // ele lanca excessao porque eventualmente o ficheiro pode nao existir ou nao ter permissao de escrita.
        // TODO code application logic here
       
        Path caminho = Paths.get("C:/xti/files/texto.txt"); // Para criar um ficheiro "texto,txt" no caminho "C:/xti/files/"
        Charset utf8 = StandardCharsets.UTF_8; // codificamos o ficheiro com UTF_8 que é para o latim;
             
        
        /* Escrita */
        
        BufferedWriter w = null;
        
        try{
             w = Files.newBufferedWriter(caminho, utf8); // chamei um escritor que é um metodo "newBufferedWriter" que esta dentro da classe Files;
             // w é um objecto do tipo BufferedWriter;
             w.write("outro texto\n");
             w.write("outro texto\n");// o Writer ele armazena o metodo no repositorio (Buffered) ou seja na memoria
             w.flush(); // o metodo flush() elé é responsavel por pegar o conteudo da memoria e armazenar no HD;
           }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(w != null){
                w.close(); // Close tem que usar sempre serve para desligar o fluxo.
            }
          }  
            
          /* Outra forma apartir do java7:
            
           try(BufferedWriter w = Files.newBufferedWriter(caminho, utf8)){ 
             w.write("outro texto\n");
             w.write("outro texto\n");
           }
           catch(IOException e){
            e.printStackTrace();
           }
            
                Nao pus o metodo close() porque o pai do metodo BufferedWriter "o writer" ja tem uma interface close com um metodo Close;
            */  
            
            
            
            
            
           /* Leitura */
            
           try(BufferedReader reader = Files.newBufferedReader(caminho, utf8)){
               String line = null;
               while((line = reader.readLine()) != null) // o metodo readLine() retorna linha por linha de um arquivo.
               {
                   System.out.println(line);
               }
             } 
           catch(IOException e){
            e.printStackTrace();
           }
            
            
            
            
        }
        
        
    }