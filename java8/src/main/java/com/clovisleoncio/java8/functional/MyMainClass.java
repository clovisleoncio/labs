package com.clovisleoncio.java8.functional;

public class MyMainClass {
	
	public static void main(String[] args) {
		
		MyFunctionInterface mfi = (text) -> {
			System.out.println("Hello " + text);
		};
		
		mfi.print("World");
		
	}

}
