package A01thread;

public class Myrun implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<1000;i++)
            System.out.println(Thread.currentThread().getName()+"线程运行中");
    }
}
