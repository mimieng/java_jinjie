package A04Thread;

public class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(getName()+"@"+"线程运行中");
        }
    }
}
