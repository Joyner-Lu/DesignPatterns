package com.joyner.patterns.factory_method;

public class OrderXMLDisplayService extends DisplayService{
    @Override
    public XMLParser getParser() {
        return new OrderXMLParser();
    }
}
