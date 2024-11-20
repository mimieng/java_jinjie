package Gennericity05;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
       //目标，搞清楚泛型和集合不支持基本数据类型，只支持对象类型(引用数据类型)
        ArrayList<Integer> list = new ArrayList<>();
        //泛型擦除：泛型在运行前会被擦除，只保留类型，所以不能使用基本数据类型，只能使用引用数据类型 泛型擦除是JDK1.5之后才出现的，在JDK1.4及以前版本中，泛型是伪泛型，不支持泛型，只支持引用数据类型
        //把基本数据类型放入集合中，会自动装箱，自动装箱之后，就变成引用数据类型了，所以可以放入集合中
        //手工包装
        // Integer i = new Integer(10);
//        Integer i= Integer.valueOf(10);
        Integer i = 1120;
        Integer j = 1120;
        System.out.println(i==j);
        String s = "123";
        Double k = Double.parseDouble(s);
        System.out.println(k+1);
    }
}
