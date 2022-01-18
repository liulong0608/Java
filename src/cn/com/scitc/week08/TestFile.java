package cn.com.scitc.week08;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        File f1 = new File("d:/abc.txt");
        boolean exists = f1.exists();
        System.out.println(exists);
        //判断文件是否存在，不存在，则创建该文件
        if (!exists) {
            //创建文件
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("hello");
            }
        }
        System.out.println(f1.isFile());
        File f2 = new File("d:/xyz");
        if (!f2.exists()) {
            f2.mkdir();
        }
        System.out.println(f2.getName());
        System.out.println(f2.getPath());
        File f3 = new File("d:/");
        String[] list = f3.list();
        for (String s : list) {
            File ff = new File(f3, s);
            if (ff.isDirectory()) {
                System.out.println("<DIr>\t" + s);
            } else {
                System.out.println("\t"+s+"\t"+ff.length()/1024+"Kb");
            }
        }
    }
}
