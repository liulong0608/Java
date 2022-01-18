package cn.com.scitc.week06;

import java.util.Date;

public class Student {
    String name;
    String ID;
    String sex;
    String time;
    String _class;
    public void _showlnf(){
        System.out.println(ID);
        System.out.println(name);
        System.out.println(sex);
        System.out.println(time);
        System.out.println(_class);

    }
    public double getArea(double r){
        return r*r*3.1415;
    }
}
