package com.joyner.patterns.visitor;

public class CssClassVisitor implements Visitor{

	@Override
	public void visit(HtmlTag element) {
		element.setStartTag(element.getStartTag().replace(">", " class='visitor'>"));
		
	}


}
