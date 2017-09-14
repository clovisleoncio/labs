package com.clovisleoncio.java8.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(new Integer[] {1, 2, 3, 4});
		
		lista.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println("Anonnymous " + i);
			}
		});
		
	}

}
