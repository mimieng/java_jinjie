package A03Thread;

public class ThreadDemo {
    public static void main(String[] args){
        MyrunDemo myrunDemo=new MyrunDemo();
        Thread thread1=new Thread(myrunDemo,"飞机");
        Thread thread2=new Thread(myrunDemo,"塔克");
//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
        thread1.setPriority(10);
        thread2.setPriority(1);

        thread1.start();
        thread2.start();
    }
}
