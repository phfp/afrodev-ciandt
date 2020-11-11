package Aula7;

// EXPERIMETOS
// *** Aumentando o newFixedThreadPool(): Resultado como esperado, tem mais espaço para Threads mas só duas são executadas.
// *** Aumentando as Threads: Para cada Thread a mais do que a capacidade da Poll, é feita uma execução extra, isso pq é usado "do while"
// que executa ante para depois fazer a verificacao. Com somente "While" o programa volta com o comportamento esperado.
// *** Aumentando o newFixedThreadPool() e Threads: Eu esperava o comportamento normal do programa, mas a saída não segue a sequencia.
// Não consegui explicar o motivo.
// *** Aumentando o newFixedThreadPool() e Threads e numero de iteracoes de SafelockDemo.getCount(): Comportamento continua anormal
// *** Diminuir o número de iteracoes de afelockDemo.getCount() para 2: Resultado aleatorio, cada tread é executada uma vez.
// Não consegui entender tambem.
// Obs.: inclui um pool.shutdown() ao final pois o programa nao terminava a execuçãoa.


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Safelock2 implements Runnable{

    @Override
    public void run() {
        do {
            System.out.println(Thread.currentThread().getName() + " count: " + SafelockDemo.increment());
        } while (SafelockDemo.getCount() < 11);

        // while(SafelockDemo.getCount() < 11)
        //     System.out.println(Thread.currentThread().getName() + " count: " + SafelockDemo.increment());
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(new Safelock2());
        pool.execute(new Safelock2());
        pool.shutdown();
    }
    
}
