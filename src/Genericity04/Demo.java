package Genericity04;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo {
    public static void main(String[] args)
    {
        //目标：理解通配符和上下限
        ArrayList<xiaomi> list1 = new ArrayList<>();
        list1.add(new xiaomi());
        list1.add(new xiaomi());
        list1.add(new xiaomi());
        print(list1);
        ArrayList<BYD> list2 = new ArrayList<>();
        list2.add(new BYD());
        list2.add(new BYD());
        list2.add(new BYD());
        print(list2);
        ArrayList<Dog> list3 = new ArrayList<>();
        list3.add(new Dog());
        list3.add(new Dog());
        list3.add(new Dog());
//        print(list3);
    }
    public static void print(ArrayList<? extends Car> list)
    {
        for (Car car : list) {
            System.out.println(car);
        }
    }
}
