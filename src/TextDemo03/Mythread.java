package TextDemo03;

import java.math.BigDecimal;
import java.util.Random;

public class Mythread extends Thread{
    static BigDecimal money=BigDecimal.valueOf(100.0);
//    一百块钱
    static int count=3;
    //分成三个包
    static final BigDecimal  MIN=BigDecimal.valueOf(0.01);
    //最小抢0.01

    //同步代码块
    public void run(){

            synchronized (Mythread.class){
               if (count==0){
                   //判断，共享数据是否到了末尾（到了末尾）
                   System.out.println(getName()+"没有抢到红包");
               }else{
                   BigDecimal prize;
                   //判断，判断共享数据是否到了末尾（没有到末尾）
                   if (count==1){
                       prize=money;
                   }else {
                       //随机抢
                       Random random=new Random();
                       //第一个红包：99.98元
//                       抽奖范围
                       double temp=money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                       //抽奖金额
                       prize=BigDecimal.valueOf(random.nextDouble(temp));

                       }
//                   设置抽中红包，小数点保留两位
                   prize=prize.setScale(2,BigDecimal.ROUND_HALF_UP);
                   //在中金额中去掉对应的钱
                   money=money.subtract(prize);
                   count--;
                   //红包少一个

                   //不能随机
                   System.out.println(getName()+"抢到了"+prize+"元");
                   }

               }
            }
        }


