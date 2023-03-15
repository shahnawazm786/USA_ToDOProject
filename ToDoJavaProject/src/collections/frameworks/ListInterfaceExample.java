package collections.frameworks;

import java.util.*;
public class ListInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		li.add("Java");
		li.add("C");
		li.add("C++");
		li.add("Oracle");
		li.add("Ruby");
		li.add("Java Script");
		System.out.println(li);
		System.out.println(li.get(0));
		System.out.println("--- Remove By Index-----");
		li.remove(1);
		System.out.println(li);
		
		System.out.println("--- Remove By Value/Object-----");
		li.remove("Ruby");
		System.out.println(li);
		
		for(int i=0; i<li.size();i++) {
			System.out.println(li.get(i));
		}
		Iterator itr=li.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-- Add Null Value ----");
		li.add(null);
		System.out.println(li);
		System.out.println("-- Duplicate Null Value ----");
		li.add(null);
		System.out.println(li);
		
		System.out.println("-- Add Duplicate Value ----");
		li.add("Java");
		System.out.println(li);
		System.out.println("-- Add Duplicate Value ----");
		li.add("Java");
		System.out.println(li);
		System.out.println("-- Add Value In Between ----");
		li.add(2, "Python");
		System.out.println(li);
		
	}

}
