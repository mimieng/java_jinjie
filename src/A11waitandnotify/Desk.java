package A11waitandnotify;

public class Desk {
    public static int foodNum = 0;
    //是否有面条 0没有 1有
    public static  int MAX_FOOD_NUM = 10;
    //总个数
    public static Object lock = new Object();
    //s锁对象
}
