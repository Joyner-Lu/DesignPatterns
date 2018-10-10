package com.joyner.patterns.factory_method;

public class FeedbackXMLDisplayService extends DisplayService{
    @Override
    public XMLParser getParser() {
        return new FeedbackXML();
    }
}
