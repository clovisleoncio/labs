package com.clovisleoncio.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sorter {

	static class DataHolder implements Comparable<DataHolder> {

		private Integer i;
		private Long numberOfOne;

		public DataHolder(int i) {
			this.i = i;
			this.numberOfOne = Integer.toBinaryString(i).chars().parallel().filter( (a) -> a == '1' ).count();
		}

		@Override
		public int compareTo(DataHolder o) {
			int result = this.numberOfOne.compareTo(o.numberOfOne);
			if (result != 0) {
				return result;
			}
			else {
				return this.i.compareTo(o.i);
			}
		}
	}

	static int[] rearrange(int[] elements) {
		List<DataHolder> elementsList = Arrays.stream(elements).mapToObj(i -> new DataHolder(i)).collect(Collectors.toList());
		Collections.sort(elementsList);
		return elementsList.stream().mapToInt(dh -> dh.i).toArray();
	}

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int[] elements = IntStream.range(1, 10).toArray();
		int[] results = rearrange(elements);
		System.out.println(Arrays.toString(results));

		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
}

}
