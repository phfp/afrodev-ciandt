package Aula6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {


    public void teste(){

        List<String> listaAprovados = new ArrayList<>();

        listaAprovados.add("Maria");
        listaAprovados.add("Joao");
        listaAprovados.add("Antonio");
        listaAprovados.add("Ana");
        listaAprovados.add("Joao");

        Collections.sort(listaAprovados);

        System.out.println(listaAprovados);
    }

    
}
