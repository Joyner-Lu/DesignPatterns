package com.joyner.patterns.abstract_factory_method;

import com.joyner.patterns.factory_method.XMLParser;

public class TWOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing order XML...");
        return "TW Order XML Message";
    }
}
