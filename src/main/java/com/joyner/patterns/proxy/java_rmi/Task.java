package com.joyner.patterns.proxy.java_rmi;

public interface Task<T> {
    T execute();
}