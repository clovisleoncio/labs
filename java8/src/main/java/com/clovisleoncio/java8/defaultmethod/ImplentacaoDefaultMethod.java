package com.clovisleoncio.java8.defaultmethod;

public class ImplentacaoDefaultMethod implements InterfaceDefaultMethod, InterfaceDefaultMethodConflict {

	@Override
	public String getString() {
		return "Hello!";
	}
	
	public static void main(String[] args) {
		
		new ImplentacaoDefaultMethod().print();
		
	}
	
	@Override
	public void print() {
		InterfaceDefaultMethod.super.print();
	}

}
