/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperacoes;

/**
 *
 * @author Leandro Ucuamba
 */
public class StringOperacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s1="write once";
        String s2 = s1 + "Run Anywhere";
        String s3 = new String("Java Virtual Machine");
        char[] array = {'J','A','V','A'};
        String s4 = new String(array);
        
        //Operacoes
        int tamanho = s1.length(); // -> Serve para retornr o numero de caracteres dentro da string no formato inteiro.
        s1.charAt(0); // -> localiza o caracter na posicao inserida.
        String texto = s1.toString(); // -> devolve a string completa.
        
        //Localizacao
        int posicao = s3.indexOf('J'); // -> localiza a posicao onde comeca a a string.
        int posic = s3.lastIndexOf('a'); // -> localiza a posicao da ultima letra a;
        s3.isEmpty(); // -> se a string estiver vazia retorna true senao false.
        
        //Comparacao
        String xti = "XTI";
       // boolean x = xti.equals("xti");
       // boolean x = xti.equalsIgnoreCase("xti");
       // boolean x = xti.startsWith("xt");
        boolean x = xti.endsWith("xt");
        System.out.println(x);
        
        String l = "O Brasil é Lindo";
        String sl = l.substring(11); // -> vai pegar uma parte desta string comecando da posicao 11.
        sl = l.substring(2,8); // -> ele vai pegar da posicao 2 a 8 = Brasil.
        sl = l.concat("que maravilha"); // -> vai acrescentar a string de cima = O Brasil é Lindo que maravilha.
        sl = l.replace('s', 'z'); // -> substitui todas as letras s por z.
        sl = l.replaceAll("", "X"); // -> substitui os espaco em branco por X.
        
        sl = l.toLowerCase(); // -> converte a string maiuscula em minuscula.
        sl = l.toUpperCase(); // -> converte a string minuscula em maiuscula.
        
        System.out.println("  Espaco  ".trim()); // -> ele limpa o espaco em branco.
        
        
    }
    
}
