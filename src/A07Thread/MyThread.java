package A07Thread;

public class MyThread extends Thread{
    //static 共享数据
    static int ticket = 0;
//    static Object obj = new Object();
//    锁对象，一定要是唯一的
    public void run() {
        while (true) {
//            代码同步块
          synchronized (MyThread.class){
              if (ticket <= 100) {
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println(getName() + "卖票，票号为：" + ticket++);
              }

              else
                  break;
          }
        }
    }

}
