package Aula6;

import java.util.HashMap;
import java.util.Map;

public class Exercicio3 {

    public void teste() {

        Map cache = new HashMap <String, Double>();

        int num1 = 123;
        int num2 = 234;
        int num3 = 543;

        //Preenchendo a cache
        cache.put(num1,Math.log(num1));
        cache.put(num2,Math.log(num2));
        cache.put(num3,Math.log(num3));

        int valorTeste = 765;

        Object existe = cache.get(valorTeste);

        if(existe == null) {
            cache.put(valorTeste,Math.log(valorTeste));            
        }          
        
    }
    
}
