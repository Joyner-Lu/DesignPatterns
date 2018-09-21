package com.joyner.patterns.singleton;

public class SingletonEager {
    //外部不能构造
    private SingletonEager(){}

    private static SingletonEager sc = new SingletonEager();
    public static SingletonEager getInstance(){
        return sc;
    }
}