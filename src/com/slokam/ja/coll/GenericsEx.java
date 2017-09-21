package com.slokam.ja.coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.slokam.ja.A;

public class GenericsEx {

	
	public void test1(){
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("bharath");
		list.add("asdsa");
		
		for(String st : list){
			System.out.println(st);
		}
		
		A a1 = new A();
		A a2 = new A();
		List<A> li1 = new ArrayList<A>();
		li1.add(a1);
		li1.add(a2);
		
		for(A oa : li1){
			oa.eat();
		}
		//Primitive datatypes 
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		
		for (Integer i : s) {
			System.out.println(i);
		}
		
	} 
}
