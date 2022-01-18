package cn.com.scitc.week04;

public class Narcissistic {
    public static void main(String[] args) {
                //分出数的个、十、百位
        for (int i = 100;i <= 1000;i++){
            int hundreds = i / 100;
            int tens = i % 100 / 10;
            int units = i % 10;
            if (i == units*units*units+tens*tens*tens+hundreds*hundreds*hundreds){
                System.out.println(i);
            }
        }














//        for (int i = 0;i <= 100;i++){
//            if (i % 3 == 0 && i % 7 == 0){
//                System.out.println(i);
//            }
//        }
    }
}
