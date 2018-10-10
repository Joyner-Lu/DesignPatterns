package com.joyner.patterns.factory_method;

public class ResponseXMLParser implements XMLParser{
    @Override
    public String parse() {
        System.out.println("Parsing response XML...");
        return "Response XML Message";
    }
}
