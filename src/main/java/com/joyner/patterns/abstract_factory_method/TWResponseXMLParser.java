package com.joyner.patterns.abstract_factory_method;

import com.joyner.patterns.factory_method.XMLParser;

public class TWResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing response XML...");
        return "TW Response XML Message";
    }
}
