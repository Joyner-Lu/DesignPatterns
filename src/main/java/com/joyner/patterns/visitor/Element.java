package com.joyner.patterns.visitor;

public interface Element {
	
	public void accept(Visitor visitor);
}
