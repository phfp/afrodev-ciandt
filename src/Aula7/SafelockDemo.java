package Aula7;

public class SafelockDemo {

    private SafelockDemo(){}

    private static int count = 0;

    public static int increment() {
        return ++count;
    }

    public static int getCount() {
        return count;
    }
    
}
