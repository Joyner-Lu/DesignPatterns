package com.joyner.patterns.factory_method;

public class ResponseXMLDisplayService extends DisplayService{
    @Override
    public XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
