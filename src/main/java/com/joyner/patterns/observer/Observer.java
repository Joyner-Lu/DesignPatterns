package com.joyner.patterns.observer;

public interface Observer {

    public void update(String desc);
    public void subscribe();
    public void unSubscribe();
}
