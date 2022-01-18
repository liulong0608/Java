package cn.com.scitc.week06;

public class WorkerTest {
    public static void main(String[] args) {
        Worker wk1 = new Worker();

        wk1.ID = "20301161";
        wk1.name = "江";
        wk1.sex = "男";
        wk1.time = "1990-6-18";
        wk1.show();

        wk1.add(6,9);
        double result = wk1.add(1.236f,3.666f);
        System.out.println(result);
        Worker wk2 = new Worker("23515","江","男","1990-12-6");
    }
}
