package Myreflect03;

public class student {
    private String name;
    public int age;
    public student(){}
    public student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
        return "名字"+name+"年龄"+age;
    }
}
