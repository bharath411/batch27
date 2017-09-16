package com.slokam.ja;

public class Ops {

	 public static void main(String[] args) {
		A aa  = new A();
		aa.eat();
		aa.sleep();
		aa.run();
		
		X xa = new A();
		
		xa.eat();
		xa.sleep();
		//xa.run();
		
		X xb  = new B();
		
		xb.eat();
		xb.sleep();
		//xb.fun();
		
		B b = new B();
		b.eat();
		b.sleep();
		b.fun();
		String s = B.temp();
		boolean boo = s.equals("bharath");
		
		boolean bbo  = B.temp().equals("");
		
		
		
		
		
		B.ex2();
		//b.run();
		
		A a = new A();
		B bb = new B();
		
		/*A aaa = new B();
		B abb = new A();*/
		
		
		
		
		
		
		
	}
}
