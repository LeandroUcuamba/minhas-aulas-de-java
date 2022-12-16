/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionariopacote;

/**
 *
 * @author Leandro Ucuamba
 */
public class Funcionario {
    
    private String nome;
    /* desta formas as outras classes nao acessarao direitamente esta variavel */
    
    /* Visto que nenhuma classe tera acesso a esta variavel agora devo criar
    um metodo para returnar o vlor da variavel para outras classes "dai usa get() e set()" */
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
}
