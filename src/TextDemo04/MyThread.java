package TextDemo04;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyThread extends Thread{
    ArrayList<Integer> list;
    public MyThread(ArrayList<Integer> list){
        this.list=list;
    }
    @Override
    public void run() {
       while (true){
           synchronized (MyThread.class){
               if (list.size()==0){
                   break;
               }
               else{
                   //继续抽奖
                   int index=list.remove(0);
                   System.out.println(getName()+"抽中了"+index);
               }
           }
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
