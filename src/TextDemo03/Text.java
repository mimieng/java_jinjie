package TextDemo03;


public class Text {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();
        Mythread t4 = new Mythread();
        Mythread t5 = new Mythread();
        t4.setName("小明");
        t5.setName("小红");
        t3.setName("小王");
        t2.setName("小单");
        t1.setName("小一");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
