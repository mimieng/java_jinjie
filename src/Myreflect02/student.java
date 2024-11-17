package Myreflect02;

public class student {
    private String name;
    private int age;

    public student() {    }
    public  student(String name) {
        this.name = name;

    }
    protected student( int age) {
        this.age = age;
    }
    private student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     public String toString() {
         return "student{name='" + name + "', age=" + age + "}";
     }

}
