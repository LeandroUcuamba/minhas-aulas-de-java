
package matematicatest;


public class Matematica {
    
    /*No metodo com retorno deve ter sempre um retorno no escopo "entre {}" do metodo */
    
    int maior(int um, int dois){
        
        if(um > dois)
        {
            return um;
        }
        else
        {
            return dois;
        }
    }
    
    double soma(double um, double dois){
        double s = um + dois;
        return s;
    }
    
}
