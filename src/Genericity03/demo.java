package Genericity03;

public class demo {
    public static void main(String[] args) {
        //泛型方法
        //打印任意数组内容
        String [] str={"a","b","c"};
        System.out.println(printArray(str));

    }


    public static <T> T printArray(T[] array){
         return array[0];

    }
}

