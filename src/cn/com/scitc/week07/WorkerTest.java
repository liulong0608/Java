package cn.com.scitc.week07;

public class WorkerTest {
    public static void main(String[] args) {
        //无参数
        Worker w1 = new Worker("1234569","顾",25,"主管",5500);
        w1.show();

        Worker w2 = new Worker();
        w2.getSum(54321);
    }
}