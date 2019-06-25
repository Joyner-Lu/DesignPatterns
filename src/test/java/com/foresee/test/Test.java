package com.foresee.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Test {

    static String  filePath = "D:\\tmp\\test\\test.txt";

    public static void main(String[] args) throws Exception {
        test();
    }

    public static void r()throws  Exception {
        int number = 1;
        File file = new File(filePath);
        InputStream f = new FileInputStream(file);
        int b;
        while ((b = f.read()) != -1) {
            System.out.println(Integer.toHexString(b) + "-" + b);
        }

    }

    public static void w() throws  Exception {
        int number = 1;
        String character = "中";
        File file = new File(filePath);
        FileOutputStream out = new FileOutputStream(file);
        //out.write(number);
        out.write(character.getBytes());
        out.flush();
        out.close();
    }

    public static void test() {
        Charset charset = Charset.defaultCharset();
        System.out.println(charset);


    }
}


