package com.slokam.ja.coll;

import java.util.ArrayList;
import java.util.Iterator;

import com.slokam.ja.A;
import com.slokam.ja.B;

public class ListExample {

	public void test1(){
		
		ArrayList arr = new ArrayList();
		
		//Adding elements to arraylist.
		A a = new A();
		arr.add(10);
		arr.add(true);
		arr.add(10.4);
		arr.add(a);
		arr.add(a);
		//retrieve the values from arraylist
		
		Object obj = arr.get(3);
		//type casting.
		//A aa = obj;
		
		Object o0 = arr.get(0);
		System.out.println(o0);
		int size = arr.size();
		for(int i=0 ; i<size;i++){
			Object o =  arr.get(i);
			System.out.println(o);
		}
		
		//for each
		for(Object o1 : arr){
			System.out.println(o1);
		}
		
		// Iterator.
		Iterator it = arr.iterator();
		
		while(it.hasNext()){
			Object ob = it.next();
			System.out.println(ob);
		}
		
	}
	
	public void test2(){
		
		A a  = new A();
		a.eat();
		B b = new B();
		b.sleep();
		
		ArrayList ar = new ArrayList();
		
		ar.add(a);
		ar.add(b);
		ar.add(10);
		
		Object o2 = ar.get(2);
		int ii = (int) o2;
		System.out.println(ii);
		
		Object o0 = ar.get(0);
		
		A aaa =(A)o0;
		aaa.eat();
		Object o1 = ar.get(1);
		B bb = (B)o1;
		bb.sleep();
		
		for (Object object : ar) {
			
			if (object instanceof A) {
				A aa = (A) object;
				aa.eat();
			}else if (object instanceof B) {
				B bbb = (B) object;
				bbb.eat();
			}
			
			A aa = (A)object;
			aa.eat();
		}
	}
	public static void main(String[] args) {
		ListExample a = new ListExample();
		a.test2();
	}
}
