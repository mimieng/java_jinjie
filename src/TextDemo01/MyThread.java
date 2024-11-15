package TextDemo01;

public class MyThread extends Thread{
    static Object lock = new Object();
    public static int count =100;
    public void run(){
        synchronized (lock){
            while (true){
                if (count<10){
                    break;
                }else {
                    System.out.println(getName()+"送的礼物:还剩"+count--);
                }
            }
        }

    }
}
