package A013ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args)
    {
        /*
        public static ExecutorService newFixedThreadPool(int nThreads) 创建一个有航线的线程池
        创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
        public static ExecutorService newCachedThreadPool() 创建一个没有上线的线程池
         */
//        ExecutorService  pool= Executors.newFixedThreadPool(3);
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
        ExecutorService pool=Executors.newCachedThreadPool();
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
    }
}
