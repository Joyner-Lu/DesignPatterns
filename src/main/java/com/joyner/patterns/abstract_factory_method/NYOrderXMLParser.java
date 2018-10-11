package com.joyner.patterns.abstract_factory_method;

import com.joyner.patterns.factory_method.XMLParser;

public class NYOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("NY Parsing order XML...");
        return "NY Order XML Message";
    }
}
