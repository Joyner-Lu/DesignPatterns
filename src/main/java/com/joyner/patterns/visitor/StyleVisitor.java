package com.joyner.patterns.visitor;

public class StyleVisitor implements Visitor {

	@Override
	public void visit(HtmlTag element) {
		element.setStartTag(element.getStartTag().replace(">", " style='width:46px;'>"));
		
	}

}
