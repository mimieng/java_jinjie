package A05Thread;

public class MyThread extends Thread{
    public void run()
        {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName()+" "+i);
                //表示出让当前CPU的执行权
                Thread.yield();
            }
        }
}
