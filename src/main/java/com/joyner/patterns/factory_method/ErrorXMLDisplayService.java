package com.joyner.patterns.factory_method;

public class ErrorXMLDisplayService extends DisplayService{
    @Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }

}
