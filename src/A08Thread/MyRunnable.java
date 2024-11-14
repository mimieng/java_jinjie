package A08Thread;

public class MyRunnable implements Runnable {
    int titicks = 0;

    @Override
    public void run() {
        while (true) {
//同步代码块
                if (method()) break;

        }
    }

    private synchronized boolean method() {
//        判断共享数据是否到了末尾，如果到了末尾
        if (titicks == 100) {
            return true;
        } else {
//            判断共享数据是否到了末尾，如果没到了末尾
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票" + titicks++);

        }
        return false;
    }
}

