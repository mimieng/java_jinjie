package Genericity;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //目标：认识泛型，搞清楚使用泛型的好处
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("C++");
//        list.add(100);

        //获取数据，遍历
        for (Object o:list){
            String s = (String) o;
            System.out.println(s);
        }

        }

    }

