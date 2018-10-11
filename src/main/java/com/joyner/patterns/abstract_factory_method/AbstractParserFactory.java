package com.joyner.patterns.abstract_factory_method;

import com.joyner.patterns.factory_method.XMLParser;

public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);
}
