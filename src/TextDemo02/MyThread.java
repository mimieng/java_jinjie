package TextDemo02;

public class MyThread extends Thread{
    static Object lock = new Object();
    public static int count = 0;
    public void run(){
        while (count<100){
            synchronized (lock){
            if (count%2!=0){
                System.out.println(getName()+"@"+count);
            }else {
                count++;
                continue;
            }
            count++;

            }
        }
    }

}