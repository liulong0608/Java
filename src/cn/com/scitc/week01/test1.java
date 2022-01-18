package cn.com.scitc.week01;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int x = 4,y = 6;
        boolean z = false;

        System.out.println(x + x * 10);
        System.out.println(x + y * x--);
        System.out.println(--y / (float)x);
        System.out.println(x == y && z);
        System.out.println(x<y?y--:++x);
    }
}
