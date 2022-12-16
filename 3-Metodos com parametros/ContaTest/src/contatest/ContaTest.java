
package contatest;

/**
 *
 * @author Leandro Ucuamba
 */
public class ContaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta conta = new Conta ();
        conta.cliente = "Ricardo";
        conta.saldo = 10_000.00;
        conta.exibeSaldo();
        
        Conta destino = new Conta ();
        destino.cliente = "Lawrence";
        destino.saldo = 8_000.00;
        destino.exibeSaldo();
        
        conta.transferePara(destino, 1550.00);
        conta.exibeSaldo();
        destino.exibeSaldo();
  
        
    }
    
}
