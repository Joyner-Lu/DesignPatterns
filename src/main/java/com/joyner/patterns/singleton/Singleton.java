package com.joyner.patterns.singleton;

import java.io.ObjectStreamException;

public class Singleton {

    private static final long serialVersionUID = -1093810940935189395L;
    //禁止指令重排
    private volatile static Singleton sc = null;

    private Singleton() {
        //An "if condition" inside the constructor can prevent the singleton from getting instantiated more than once using reflection
        if (sc != null) {
            throw new IllegalStateException("Already created.");
        }
    }

    public static Singleton getInstance(){
        //双重锁定
        if(sc==null){
            synchronized(Singleton.class){
                if(sc==null){
                    sc = new Singleton();
                }
            }
        }
        return sc;
    }

    /***
     * readResolve读取同一个对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return sc;
    }

    /**
     * 写入同一个对象
     * @return
     * @throws ObjectStreamException
     */
    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    /**
     * 不能被复制
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, cannot be clonned");
    }

    public static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null)
            classLoader = Singleton.class.getClassLoader();
          return (classLoader.loadClass(classname));
    }
}
