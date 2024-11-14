package A08Thread;

public class ThreadDemo {
    public static void main(String[] args)
    {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread1=new Thread(myRunnable);
        Thread thread2=new Thread(myRunnable);
        Thread thread3=new Thread(myRunnable);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
