package Progressao;

public class ProgressaoGeometrica implements Progressao {
    public void imprimirSequencia(int valor) {
        for(int i=0; i<valor; i++) {
            System.out.print(i*2+" ");
        }
    }    
}
