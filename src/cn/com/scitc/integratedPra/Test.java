package cn.com.scitc.integratedPra;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Test {
    public static void main(String[] args) {
        /*题20：根据下列流程图编写程序实现相应分析处理并显示结果，并设计最少的测试数据进行语句覆盖测试。
        输入数据打印出“输入x值：”、“输入y值：”。输出文字“a=x”（x为2、3或4）；其中变量x、y均须为整型。

//        定义变量
        int x,y;
//        定义输入变量
        Scanner in = new Scanner(System.in);

//        输入x
        System.out.println("请输入x：");
        if (in.hasNextInt()){
            x= in.nextInt();
        }else {
            System.out.println("你输入的x不是整数!");
            return;
        }
        //        输入y
        System.out.println("请输入y：");
        if (in.hasNextInt()){
            y= in.nextInt();
        }else {
            System.out.println("你输入的y不是整数!");
            return;
        }

//        处理
        if (x >= 80 && y >= 60){
            if (!(x >= 90 || y >= 90)){
                System.out.println("a=2");
            }
        }else {
            if (x <= 70 || y <=70){
                System.out.println("a=3");
            }else {
                System.out.println("a=4");
            }
        }*/
        /*********************************************************************************//*
        题 19：根据下列流程图编写程序实现相应分析处理并显示结果，并设计最少的测试数据进行判定条件覆盖测试。
        输入数据打印出“输入x值：”、“输入y值：”。输出文字“a的值：”和a的值；输出文字“b的值:”和b的值；输出文字“c的值：”和c的值；
        输出文字“d的值：”和d的值；其中变量x、y均须为整型。*/

        //        定义变量
        int x,y;
//        定义输入变量
        Scanner in = new Scanner(System.in);

//        输入x
        System.out.println("请输入x：");
        if (in.hasNextInt()){
            x= in.nextInt();
        }else {
            System.out.println("你输入的x不是整数!");
            return;
        }
        //        输入y
        System.out.println("请输入y：");
        if (in.hasNextInt()){
            y= in.nextInt();
        }else {
            System.out.println("你输入的y不是整数!");
            return;
        }
//        处理
        if (!(x > 9 && y >4)){
            if (x > 0 || y > 0){
                System.out.println("a="+pow(x,y));
            }else {
                System.out.println("b="+(y+x));
            }
        }else {
            if (x > 20 || y > 10){
                System.out.println("c="+Math.toRadians(Math.sin(x+y)));
            }else {
                System.out.println("d="+pow((x+y),5));
            }
        }
        /***********************************************************************************************************/
        /*
        题18：根据输入的三条边值判断能组成何种三角形，并设计测试数据进行判定覆盖测试。三条边为变量a、b、c，范围为1≤边值≤10，不在范围内，
        提示“输入边值不在范围内，请重新输入”。
        不满足任意两边之和必须大于第三边，提示“输入边值不能组成三角形”。输入边值能组成三角形，只有2条边相同，
        显示“能组成等腰三角形”；三条边相等，显示“能组成等边三角形”；边值不满足特殊三角形显示“能组成普通三角形”。
        * */
//        Scanner in=new Scanner(System.in);
//        int a,b,c;
//
//        if (){
//
//        }
}
}
