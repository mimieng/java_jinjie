package A02thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class text {
    public static void main(String[] args)throws ExecutionException, InterruptedException {
        MyCallable myCallable=new MyCallable();
        FutureTask<Integer> futureTask=new FutureTask<>(myCallable);

        Thread thread1=new Thread(futureTask);
        Thread thread2=new Thread(futureTask);

        thread1.setName("线程1");
        thread1.start();
        thread2.setName("线程2");
        thread2.start();
        Integer result=futureTask.get();

        System.out.println(result);
    }
}
