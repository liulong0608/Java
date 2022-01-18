package cn.com.scitc.week08;

public class Test {
    public static void main(String[] args) {
        Subinterface k1 = new Subinterface();
        k1.name = "大头儿子";
        k1.showName();
        k1.driver();
        k1.cook();

        Subinterface k2 = new Subinterface();
        k2.name = "大头妹妹";
        k2.showName();
        k2.driver();
        k2.cook();
    }
}
