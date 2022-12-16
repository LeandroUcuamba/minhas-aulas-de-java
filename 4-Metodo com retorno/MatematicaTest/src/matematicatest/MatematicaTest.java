
package matematicatest;


public class MatematicaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematica m = new Matematica();
        int ma = m.maior(10,20);
        System.out.println(ma);
        
        double so = m.soma(10, 20);
        System.out.println(so);
        
        /* Tambem podemos usar o retorno de metodos dentro de metodos
        
        Ex: int par = m.maior(4,6);
            int impar = m.maior(5,3);
        
            double so = m.soma(par, impar);
        
        */
    }
    
}
