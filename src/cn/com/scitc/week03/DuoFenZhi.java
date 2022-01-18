package cn.com.scitc.week03;

import java.util.Scanner;

public class DuoFenZhi {
    public static void main(String[] args) {
        //定义输入对象
        Scanner in = new Scanner(System.in);
        System.out.println("请输入成绩：");
        byte age = in.nextByte();
        int f = age / 10;

        switch (f) {
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
        if (age >= 90 && age<=100) {
            System.out.println("优");
        } else if (age >= 80) {
            System.out.println("良");
        } else if (age >= 70) {
            System.out.println("中");
        } else if (age >= 60) {
            System.out.println("及格");
        } else if(age<60 && age>=0){
            System.out.println("不及格");
        }
    }
}
