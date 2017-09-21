package com.slokam.ja.coll;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public void test1(){
		
		HashSet set = new HashSet();
		
		set.add("bharath");
		set.add(10);
		set.add(true);
		set.add(10.4);
		
		System.out.println(set.size());
		set.add(8);
		System.out.println(set.size());
		set.add(false);
		System.out.println(set.size());
		
		
		for( Object ob: set){
			System.out.println(ob);
		}
		
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		SetExample ex = new SetExample();
		ex.test1();
	}
}
