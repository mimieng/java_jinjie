package Myreflect01;

public class Text {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        获取class对象的三种方式
        1.类名.class
        2.对象.getClass()
        3.Class.forName("全类名")
         */
        Class c1=Class.forName("Myreflect01.student");
        student s=new student();
        Class c2 = s.getClass();
        Class c3=student.class;
         System.out.println(c1==c2);
         System.out.println(c1==c3);
    }
}
