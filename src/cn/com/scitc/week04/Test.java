package cn.com.scitc.week04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter length: ");
        num=in.nextInt();
        int[] n=new int[num];
        int i, sum=0;
        float aver;
        System.out.print("Please enter "+num+" numbers: ");
        for(i=0; i<num; i++) {
            n[i]=in.nextInt();
            sum+=n[i];
        }
        aver=(float)sum/num;
        System.out.println("Average="+aver);
        System.out.print("Greater than average numbers: ");
        for(i=0; i<num; i++)
            if(n[i]>aver)
                System.out.print(" "+n[i]+" ");

    }
}
