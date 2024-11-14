package A07Thread;
public class ThreadDemo {
    public static void main(String[] args) {
        /*
        需求：
        某电影院目前正在上映国产大片，共有100张票，而他有3个窗口卖票，请设计一个程序模拟该电影卖票
         */
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        MyThread myThread3=new MyThread();
        myThread1.setName("窗口一");
        myThread2.setName("窗口二");
        myThread3.setName("窗口三");
        myThread3.start();
        myThread1.start();
        myThread2.start();

    }
}
