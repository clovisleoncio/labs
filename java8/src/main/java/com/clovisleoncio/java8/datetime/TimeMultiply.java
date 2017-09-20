package com.clovisleoncio.java8.datetime;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TimeMultiply {
	
	public static void main(String[] args) {
		
		Duration oneTrip = Duration.of(40, ChronoUnit.MINUTES);
		
		System.out.println(oneTrip);
		
		Duration perDay = oneTrip.multipliedBy(2);
		
		System.out.println(perDay);
		
		Duration perWeek = perDay.multipliedBy(5);
		
		System.out.println(perWeek);
		
		Duration perYear = perWeek.multipliedBy(52);
		
		System.out.println(perYear);
	}
	
}
