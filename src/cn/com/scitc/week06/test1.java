package cn.com.scitc.week06;

public class test1 {
    public static void main(String[] args) {
        Student stu1 = new Student();

        stu1.ID = "20301161";
        stu1.name = "刘龙";
        stu1.sex = "男";
        stu1.time = "2000-06-08";
        stu1._class = "软件20-6";
        stu1._showlnf();

        Student stu2 = new Student();
//        stu2.getArea(8);
        double s = stu2.getArea(6);
        System.out.println("s="+s);
    }

}
