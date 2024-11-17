package Myreflect04;

public class Student {
    private String name;
    private int age;
    public Student()
    {

    }
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public int getAge() {
        return age;    }
    public String getName() {
        return name;
    }
    public String setAge(int age) {
        this.age = age;
        System.out.println("zhangsan"+age);
        return "xx";
    }
    public void setName(String name) {
        this.name = name;
    }
}
