package Calculadora;

public abstract class Calculadora {
    
    public abstract float calcular(float a, float b);

    private void msgInicio() {
        System.out.println("Iniciando");
    }

    private void msgFinal() {
        System.out.println("Finalizando");        
    }

    public void calculando(float a, float b) {
        msgInicio();
        System.out.println(calcular(a, b));
        msgFinal();                
    }
    
}
