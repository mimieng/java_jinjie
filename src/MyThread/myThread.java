package MyThread;

public class myThread extends Thread{
  public void run(){
      for (int i=0;i<1000;i++){
          System.out.println(getName()+"线程运行中");
      }
  }
}
