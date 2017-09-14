package com.clovisleoncio.java8.defaultmethod;

public interface InterfaceDefaultMethod {
	
	String getString();

	default void print() {
		System.out.println(getString());
	}
	
}
