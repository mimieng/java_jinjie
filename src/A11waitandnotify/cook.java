package A11waitandnotify;

public class cook extends Thread{
    public void run()
        {
            while (true) {
                synchronized (Desk.lock) {
                    if (Desk.MAX_FOOD_NUM == 0) {
                        break;
                    }
                        if (Desk.foodNum == 0) {
//                        如果已经吃光了就通知吃货吃
                            Desk.lock.notifyAll();
                            System.out.println("厨师开始做");
//                            Desk.MAX_FOOD_NUM--;
//                            System.out.println("厨师正在做第" +(10-Desk.MAX_FOOD_NUM)  + "个");
                            Desk.foodNum = 1;
                        } else {
                            try {
//                            如果还有就等待
                                Desk.lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }

        }
}
