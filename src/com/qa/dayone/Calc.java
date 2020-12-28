package com.qa.dayone;

public class Calc {
	
	public static int add(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static int minus(int a, int b, int c) {
		int d = a - b - c;
		return d;
	}
	
	public static void divide(int a, int b) {
		if(a<b) {
			System.out.println("The division cannot be performed");
		}else {
			float c = a/b;
			System.out.println(c);
		}
	}
	
	public static int multiply(int a, int b, int c) {
		int d = a * b * c;
		return d;
	}
	
	public static int modulo(int a, int b) {
		int c = a%b;
		return c;
	}
	
	public static double BODMAS(int a, int b, int c, int d, int e) {
		double f = a + (b - ((c / d) * e));
		return f;
	}
	
	
}
