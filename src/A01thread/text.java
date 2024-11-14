package A01thread;

public class text {
    public static void main(String[] args)
    {
        Myrun myrun=new Myrun();
        Thread thread1=new Thread(myrun);
        Thread thread2=new Thread(myrun);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }
}
