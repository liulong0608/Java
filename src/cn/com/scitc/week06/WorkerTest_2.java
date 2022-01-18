package cn.com.scitc.week06;

public class WorkerTest_2 {
    public static void main(String[] args) {
        Worker_2 wr1 = new Worker_2();

        wr1.setId("20303333");
        wr1.setName("顾");
        wr1.setSex("男");
        wr1.setBirthday("1990-10-23");
        wr1.setMoney(6500);
        wr1.show();

        wr1.div(18,3);
        double result = wr1.div(555f,11f);
        System.out.println(result);

        Worker_2 wr2 = new Worker_2("203033335","顾","男","1998-6-4",9020);
        wr2.show();
    }
}
