package A12waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class cook extends Thread {
    ArrayBlockingQueue<String> queue;

    public cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师做好了面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
