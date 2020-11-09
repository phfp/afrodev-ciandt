package Aula6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio1 {

    public void Teste(String[] nomes) {

        Set s = new TreeSet<String>();

        for (String nome : nomes)
            s.add(nome);
        
        System.out.println(s);

    }
    
}
