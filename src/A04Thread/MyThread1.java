package A04Thread;

public class MyThread1 extends Thread {
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(getName()+"@"+"线程运行中");
        }
    }
}
