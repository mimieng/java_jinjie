package MyThread;

public class text {
    public static void main(String[] args) {
       myThread a1=new myThread();
        myThread a2=new myThread();
        a1.setName("线程1");
        a2.setName("线程2");
        a1.start();
        a2.start();


    }
}
