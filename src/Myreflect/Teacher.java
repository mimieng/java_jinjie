package Myreflect;

public class Teacher {
    private String name;
    private int age;
    private char sex;
    public Teacher(){}
    public Teacher(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
    public String getName(){
        return name;
    }
    public int getAge(){return age;}

    public char getSex(){return sex;}
  public void setName(String name){
        this.name = name;
  }
  public void setAge(int age){
        this.age = age;
  }
  public void setSex(char sex){
        this.sex = sex;
  }


}
