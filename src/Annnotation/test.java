package Annnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {
//    @MyTest
    public void show(){
        System.out.println("show");
    }
    @MyTest
    public void show2(){
        System.out.println("show2");
    }
//    @MyTest
    public void show3(){
        System.out.println("show3");
    }
    @MyTest
    public void show4(){
        System.out.println("show4");
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        得到Class程序节对象
        Class<test> t = test.class;
//        提取这个类的所有方法
        Method[] methods = t.getDeclaredMethods();
        for (Method m:methods){
//            判断是否包含注解
            if (m.isAnnotationPresent(MyTest.class)){
//                执行方法
                m.invoke(new test());
            }
        }

    }
}
