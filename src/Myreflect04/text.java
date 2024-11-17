package Myreflect04;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class text {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c1=Class.forName("Myreflect04.Student");
        //获取所有公有方法包括父类方法
//        Method[] methods = c1.getMethods();
//        for (Method m:methods){
//            System.out.println(m);    }
        //获取所有方法不能获取父类的方法
//        Method[] declaredMethods = c1.getDeclaredMethods();
//        for (Method m:declaredMethods){
//            System.out.println(m);
//        }
        //获取指定方法
        Method setAge = c1.getDeclaredMethod("setAge", int.class);
        System.out.println(setAge);
        //获取方法修饰符
        int modifiers = setAge.getModifiers();
        System.out.println(modifiers);

        //获取方法名字
        String name = setAge.getName();
        System.out.println(name);
        Student s=new Student();
        //方法的运行
        //参数一：方法的调用者
        //参数二：给方法传递的参数
        Object invoke = setAge.invoke(s, 18);
        System.out.println(invoke);


    }
}
