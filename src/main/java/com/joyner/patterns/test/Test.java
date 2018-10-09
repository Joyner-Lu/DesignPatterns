package com.joyner.patterns.test;

import java.io.InputStream;

public class Test {

    public static void main(String[] args) {
        InputStream is = Test.class.getResourceAsStream("/test.txt");
        System.out.println(is);
    }
}
