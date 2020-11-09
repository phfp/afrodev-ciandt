package Aula5.CopiaArquivo;

public class EscreverEmArquivoDemo {

    public static void main(String[] args) {
        
        EscreveEmArquivo escrever = new EscreveEmArquivo();
        LerArquivo ler = new LerArquivo();

        escrever.Escrever();
        ler.Ler();
    }    
}
