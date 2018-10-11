package com.joyner.patterns.abstract_factory_method;

import com.joyner.patterns.factory_method.XMLParser;

public class TWFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing feedback XML...");
        return "TW Feedback XML Message";
    }
}
