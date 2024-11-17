package Myreflect03;

import java.lang.reflect.Field;

public class text {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取字节码文件对象
        Class<?> c1 = Class.forName("Myreflect03.student");
        //获取所有的成员变量
//        Field[] field = c1.getDeclaredFields();
//        for (Field f:field){
//            System.out.println(f);
//        }
        Field field = c1.getDeclaredField("name");
        System.out.println(field);
        //获取权限修饰符
        int modifiers = field.getModifiers();
        System.out.println(modifiers);
        //获取成员变量的名字
        String name = field.getName();
        System.out.println(name);
        //获取成员变量的数据类型
        Class<?> type = field.getType();
        System.out.println(type);
        //获取成员变量的值
        student s=new student("张三",18);
        field.setAccessible(true);
        Object o = field.get(s);
        System.out.println(o);
        //设置成员变量的值
        field.set(s,"李四");
        System.out.println(s);
    }
}
