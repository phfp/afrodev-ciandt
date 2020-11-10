package Aula6;

public class Pessoa implements Comparable<Pessoa>{
    protected String nome;
    protected Integer idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = Integer.valueOf(idade);
    }

    @Override
    public int compareTo(Pessoa p) {
        int nomePessoa = this.nome.compareTo(p.nome);
        return nomePessoa == 0 ? this.idade.compareTo(p.idade) : nomePessoa;
    }
    
}
