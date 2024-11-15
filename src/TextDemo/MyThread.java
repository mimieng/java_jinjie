package TextDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int count = 0;
    static Lock lock = new ReentrantLock();

    public void run() {
        while (true) {
            lock.lock();
                try {
                    if (count == 1000) {
                        break;
                    } else {
                        count++;
                        System.out.println(getName() + ":" + count);

                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }
    }
}

