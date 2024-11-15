package A12waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args)
    {
        ArrayBlockingQueue<String> quene = new ArrayBlockingQueue<>(1);
        cook c = new cook(quene);
        Foodie f = new Foodie(quene);
        c.start();
        f.start();
    }
}
