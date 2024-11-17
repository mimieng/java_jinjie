package Myreflect05;

public class Student {
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name,int age){
            this.name = name;
            this.age = age;
    }
    public void  study(){
        System.out.println("学生正在学习");
    }
    public String getName(){  return name;}
    public int getAge(){return age;}
    public String setName(String name){return this.name = name;}
    public int setAge(int age){return this.age = age;}
    public String toString(){return "姓名："+name+"年龄："+age;}
}
