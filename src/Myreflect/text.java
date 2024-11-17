package Myreflect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class text {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student s=new Student("lisi", 18, '男',1,"计算机","10086","地球");
        Teacher t=new Teacher("张三", 18, '男');
        save(s);
    }
    public static void save(Object o) throws IllegalAccessException, IOException {
        Class<?> c1 = o.getClass();
        Field[] field = c1.getDeclaredFields();
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\javaSE\\java_code\\src\\student.txt"));
        for (Field f:field){
            f.setAccessible(true);
            //获取成员变量的名字
           String name = f.getName();
           //获取成员变量的值

           Object value = f.get(o);
            bw.write(name+"---"+value);
            bw.newLine();

        }
        bw.close();
    }
}
