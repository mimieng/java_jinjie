package TextDemo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Text {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,100,2,300,4000,50000);
        MyThread myThread1=new MyThread(list);
        MyThread myThread2=new MyThread(list);
        myThread1.setName("抽奖1");
        myThread2.setName("抽奖2");
        myThread1.start();
        myThread2.start();

    }
}
