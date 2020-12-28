package com.qa.dayone;

public class Exercises {
	
	public static int minute_converter(int a) {
		int b = a * 60;
		return b;
	}
	
	public static int hour_converter(int a) {
		int b = a * 60 * 60;
		return b;
	}
	
	public static int power_calc(int voltage, int current) {
		int power = voltage * current;
		return power;
	}

}
