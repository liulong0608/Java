package cn.com.scitc.week04;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
//        字符串
        Scanner in = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String ID = in.next();

        int len = ID.length();
        if (len == 18){
            System.out.print(ID.substring(6,10)+"年");
            System.out.print(ID.substring(10,12)+"月");
            System.out.println(ID.substring(12,14)+"日");
            int sex = Integer.parseInt(ID.substring(16,17));
            if (sex % 2 == 0){
                System.out.println("性别：女");
            }else{
                System.out.println("性别：男");
            }
        }else {
            System.out.println("你输入的身份证号格式不对！");
        }
    }
}
