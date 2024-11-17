package Myreflect02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        //获取字节码文件对象
        Class c1=Class.forName("Myreflect02.student");
//        //获取构造方法 共有的
//
//        Constructor[] cs1=c1.getConstructors();
//        for(Constructor c:cs1)
//        {
//            System.out.println(c);
//        }
        //获取所有的构造方法
//        Constructor[] cs2=c1.getDeclaredConstructors();
//        for(Constructor c:cs2) {
//            System.out.println(c); }
//        Constructor con1 = c1.getDeclaredConstructor();
//        System.out.println(con1);
//        Constructor con2 = c1.getDeclaredConstructor(String.class);
//        System.out.println(con2);
        Constructor con = c1.getDeclaredConstructor(String.class, int.class);
//        int modifiers = con.getModifiers();
//        System.out.println(modifiers);
        con.setAccessible(true);
        student san =(student) con.newInstance("张三", 18);
        System.out.println(san);


    }
}
