package A11waitandnotify;

public class ThreadDemo {
    /*
    需求：完成生产者和消费者（等待唤醒机制）的代码
    实现线程交替执行的结果
     */
public static void main(String[] args){

    cook cook=new cook();
    Foodie foodie=new Foodie();
    cook.setName("厨师");
    foodie.setName("吃货");
    cook.start();
    foodie.start();
}
}
