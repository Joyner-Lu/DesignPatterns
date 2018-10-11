package com.joyner.patterns.abstract_factory_method;

import com.joyner.patterns.factory_method.XMLParser;

public class TWParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        switch(parserType){
            case "TWERROR": return new TWErrorXMLParser();
            case "TWFEEDBACK": return new TWFeedbackXMLParser ();
            case "TWORDER": return new TWOrderXMLParser();
            case "TWRESPONSE": return new TWResponseXMLParser();
        }
        return null;
    }
}
