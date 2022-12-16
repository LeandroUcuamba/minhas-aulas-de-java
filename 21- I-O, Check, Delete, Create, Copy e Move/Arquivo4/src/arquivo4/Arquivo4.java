/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Leandro Ucuamba
 */
public class Arquivo4 {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       /* 
        Path caminho = Paths.get("C:/xti/files/texto.txt");
               
        System.out.println(Files.exists(caminho)); // verificar se existe.
        System.out.println(Files.isDirectory(caminho)); // esta a perguntar se é diretorio.
        System.out.println(Files.isRegularFile(caminho)); // se é um arquivo regular.
        System.out.println(Files.isReadable(caminho)); // se o arquivo é legivel.
        System.out.println(Files.isExecutable(caminho)); // se o arquivo é executavel.
        System.out.println(Files.size(caminho)); // ver o tamanho do arquivo.
        System.out.println(Files.getLastModifiedTime(caminho)); // ver o time da ultima vez que o arquivo foi alterado.
        Files.delete(caminho); // apaga um ficheiro.
        Files.deleteIfExists(caminho); //apaga o ficheiro se existir.
        
        */
        
        /* CREATE */
        Path caminho = Paths.get("C:/xti/files/fonte.txt");
        Files.deleteIfExists(caminho);
        Files.createFile(caminho);
        Files.write(caminho, "Meu texto".getBytes());
        
        /* COPIA */
        Path copia = Paths.get("C:/xti/files/copia.txt");
        Files.copy(caminho, copia, StandardCopyOption.REPLACE_EXISTING);
        
        /* MOVE */
        Path mover = Paths.get("C:/xti/files/move/fonte.txt");
        Files.createDirectories(mover.getParent());
        Files.move(caminho, mover, StandardCopyOption.REPLACE_EXISTING);
        
    }
    
}
