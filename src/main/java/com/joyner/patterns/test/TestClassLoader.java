package com.joyner.patterns.test;

public class TestClassLoader {

    public static void main(String[] args) throws Exception {
        String classN = "com.joyner.patterns.singleton.Singleton";
        final  DiskClassLoader1 diskLoader1 = new DiskClassLoader1("D://lib//");
        final  DiskClassLoader diskLoader2 = new DiskClassLoader("D://lib//");
        Class c1 = diskLoader1.loadClass(classN);
        Class c2 = diskLoader1.loadClass(classN);

        Object o1 = c1.getMethod("getInstance").invoke(null,null);
        Object o2 = c2.getMethod("getInstance").invoke(null,null);
        System.out.println(c1.equals(c2));
        System.out.println(o1.equals(o2));



    }


}
