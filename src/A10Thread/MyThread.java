package A10Thread;

public class MyThread extends Thread{
    static Object objA = new Object();
    static Object objB = new Object();
    public void run()
    {
        while (true){
            if("线程A".equals(getName())){
                synchronized (objA){
                    System.out.println("线程A拿到了A锁，准备那B锁");
                synchronized (objB)   {
                    System.out.println("线程A拿到了B锁，顺利执行下一轮");
                }
                }

            } else if ("线程B".equals(getName())) {
                synchronized (objB){
                    System.out.println("线程B拿到了B锁，准备那A锁");
                synchronized (objA)   {
                    System.out.println("线程B拿到了A锁，顺利执行下一轮");
                }
                }

            }
        }
    }
}
