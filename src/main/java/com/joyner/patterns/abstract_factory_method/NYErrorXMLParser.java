package com.joyner.patterns.abstract_factory_method;

import com.joyner.patterns.factory_method.XMLParser;

public class NYErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing error XML...");
        return "NY Error XML Message";
    }
}
