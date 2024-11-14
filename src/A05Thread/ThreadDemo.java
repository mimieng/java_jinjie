package A05Thread;

public class ThreadDemo {
    public static void main(String[] args)
    {
        /*
        public static void yield()     出让线程/礼让线程
         */
        MyThread myThread1=new MyThread();
       MyThread myThread2=new MyThread();
       myThread1.setName("飞机");
       myThread2.setName("塔克");
       myThread1.start();
       myThread2.start();
    }
}
