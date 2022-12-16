/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Leandro Ucuamba
 */
public class Arquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Path caminho = Paths.get("C:/xti/files/texto.txt");
        System.out.println(caminho.toAbsolutePath());
        System.out.println(caminho.getParent());
        
        // Criacao de diretorios
        Files.createDirectories(caminho.getParent());
        
        // Ler e escrever arquivos
        byte[] jj = "Meu texto".getBytes();
        Files.write(caminho, jj);
        
        // para ler todo o texto do arquivo
        byte[] retorno = Files.readAllBytes(caminho);
        System.out.println(new String(retorno));
        
    }
    
}
