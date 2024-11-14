package A02thread;

public class MyCallable implements java.util.concurrent.Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100; i++)
            System.out.println(Thread.currentThread().getName()+" "+i);
        return 0;
    }
}
