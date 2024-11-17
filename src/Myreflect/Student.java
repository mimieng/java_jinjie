package Myreflect;

public class Student {
    private String name;
    private int age;
    private char sex;
    private int id;
    private String address;
    private String phone;
    private String email;

    public Student() {
    }

    public Student(String name, int age, char sex, int id, String address, String phone, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(char sex) {this.sex = sex;  }
    public void setId(int id) {
        this.id = id;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {this.email = email;}

}
