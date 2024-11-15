package A09Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Myrunnable implements Runnable {
    int ticket = 0;
     static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
//同步代码块
            lock.lock();
            try {
                if (ticket==100){
                    break;
                }
                else{

                        Thread.sleep(10);
                        System.out.println(Thread.currentThread().getName()+"卖票，票号为："+ticket++);

                    }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }

        }

        }




