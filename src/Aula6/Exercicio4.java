package Aula6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio4 {    

    public void teste() {

        Pessoa pessoa1 = new Pessoa("Paulo",35);
        Pessoa pessoa2 = new Pessoa("Joao",20);
        Pessoa pessoa3 = new Pessoa("Maria",22);
        Pessoa pessoa4 = new Pessoa("Paulo",31);
        Pessoa pessoa5 = new Pessoa("Marcia",40);
        Pessoa pessoa6 = new Pessoa("Jose",20);
        Pessoa pessoa7 = new Pessoa("Joao",75);

        List<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        listaPessoas.add(pessoa4);
        listaPessoas.add(pessoa5);
        listaPessoas.add(pessoa6);
        listaPessoas.add(pessoa7);

        Collections.sort(listaPessoas); 

        for(Pessoa pessoa: listaPessoas){
            System.out.println("Nome: "+pessoa.nome+" Idade: "+pessoa.idade);
        }
    }
    
}
