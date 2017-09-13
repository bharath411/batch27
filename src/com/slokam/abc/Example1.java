package com.slokam.abc;

import com.slokam.calculator.Add;
import com.slokam.calculator.Multiplication;


public class Example1 {

	public static void main(String[] args) {
		System.out.println("I am bharath");
		
		
		int a =10;
		int b = 20;
		
		// Add jar to build path.
		
		Add ad = new Add();
		
		int c = ad.add(a,b);
		System.out.println(c);
		
		Multiplication ml = new Multiplication();
		
		double d = 19.233;
		double e = 343.332;
		double f = ml.multiply(d, e);
		System.out.println(f);
	}
}
