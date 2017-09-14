package com.clovisleoncio.java8.lambda;

import java.util.stream.IntStream;

public class MyMainLambda {
	
	public static void main(String[] args) {
		
		System.out.println(IntStream.range(0, 10).parallel().isParallel());
		
	}

}
