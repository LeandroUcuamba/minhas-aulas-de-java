/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo5;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import sun.management.FileSystem;

/**
 *
 * @author Leandro Ucuamba
 */
public class Arquivo5 {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Iterable<Path> caminho = FileSystems.getDefault().getRootDirectories();
        for(Path OO : caminho){
            System.out.println(OO);
        } // este codigo acima é para ver os directorios raiz no pc "C:/ e H:/"
        
        /* LISTAR O CONTEUDO DE UM DIRECTORIO RAIZ  */
        Path dir = Paths.get("C:/xti/");
        try(DirectoryStream<Path> Streamkk = Files.newDirectoryStream(dir)){
            
            for(Path kk : Streamkk){
                System.out.println(kk.getFileName());
            }
            
        } catch(IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }
        
        
        /* PARTICOES DO COMPUTADOR */
        java.nio.file.FileSystem fs = FileSystems.getDefault();
         for(FileStore store : fs.getFileStores())
          {
              System.out.println("Unidade:" + store.toString()); // ver as unidades no pc;
              System.out.println("Total:" + store.getTotalSpace()); // ver o total de espaco;
              System.out.println("Disponivel:" + store.getUsableSpace()); // ver o total de espaco disponivel;
          }
        
    }
    
}
