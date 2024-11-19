package Genericity01;

public class Demo {
    public static void main(String[] args) {
        //目标：学会自己定义泛型类
        MyArraylist<String> list = new MyArraylist<String>();
        list.add("炎龙侠");
        list.add("风影侠");
        list.add("黑犀侠");
        System.out.println(list.remove("炎龙侠"));
        System.out.println(list);
    }
}
