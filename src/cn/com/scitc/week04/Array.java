package cn.com.scitc.week04;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        数组的格式：数据类型    数组名【】或
//                    数据类型【】    数组名（推荐使用）
//        数组声明后还应该开辟存储空间，即创建数组长度：
//        数组名=new 数据类型【数组长度】        int[] a=new int[6];
//        数组赋值：a[0]=1;a[1]=2;a[2]=3     或者 利用for循环赋值
        Scanner in = new Scanner(System.in);
        int[] score = new int[6];
        for (int i = 0;i < 6;i++){
            System.out.println("请输入第"+(i+1)+"个人的成绩：");
            score[i] = in.nextInt();
        }
        //计算总和
        int sum = 0;
        for (int i = 0;i < 6;i++){
            sum = sum + score[i];
//            sum+=score[i];
        }

        System.out.println("小组总成绩为："+sum);

        float avg = sum / 6;

        System.out.println("小组平均成绩为："+avg);
        for (int e: score){     //提供三个数据：元素类型、循环变量的名字、用于从中检索元素的数组
            System.out.println(e+"\t");
        }
    }
}
