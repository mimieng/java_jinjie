package Myreflect05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //读取配置文件
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("D:\\javaSE\\java_code\\prop.properties");
        p.load(fis);
        System.out.println(p);
    //获取全类名和方法名
        String classFullName=p.getProperty("classname");
        String methodName=p.getProperty("method");
        System.out.println(classFullName);
        System.out.println(methodName);
        //利用反射创建对象并运行方法
        Class clazz=Class.forName(classFullName);
        //获取构造方法
        Constructor con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();
        System.out.println(o);
        //获取成员方法并运行
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);

    }
}
