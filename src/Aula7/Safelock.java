package Aula7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Safelock implements Runnable {

    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        do {
            lock.lock();
            try{
                System.out.println(Thread.currentThread().getName() + " count: " + SafelockDemo.increment());
            } finally {
                lock.unlock();
            }
        } while(SafelockDemo.getCount() < 11);

    }

    public static void main(String[] args) {
        new Thread(new Safelock()).start();
        new Thread(new Safelock()).start();
    }
    
}
