package A04Thread;

public class ThreadDemo {
    public static void main(String[] args)
    {
        /*
        final void setDaemon(boolean on) 设置为守护线程
        细节：
        当其他的非守护线程执行完毕以后，守护线程胡陆续结束
        女神结束以后，备胎就没必要了
         */
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setName("女神");
        t2.setName("备胎");
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
