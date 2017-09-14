package com.clovisleoncio.java8.defaultmethod;

public interface InterfaceDefaultMethodConflict {
	
	default void print() {
		System.out.println("Conflict");
	}

}
