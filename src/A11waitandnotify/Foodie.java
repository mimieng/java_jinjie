package A11waitandnotify;

public class Foodie extends Thread {
    public void run(){
    while(true) {
        synchronized (Desk.lock) {
            if (Desk.MAX_FOOD_NUM==0){
                break;
            }else{
                if (Desk.foodNum==0){
//                    如果没有就等待
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                else{
                    Desk.MAX_FOOD_NUM--;
                    System.out.println("吃货正在吃第"+(10-Desk.MAX_FOOD_NUM)+"个");
                    Desk.lock.notifyAll();
                    Desk.foodNum=0;
                }
            }
        }
    }
}
}