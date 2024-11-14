package A06Thread;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
       MyThread myThread1=new MyThread();
       myThread1.setName("飞机");
       myThread1.start();
       myThread1.join();
       for (int i = 0; i < 10; i++){
           System.out.println("main"+i);
       }
    }
}
