package org.multiThread;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ll();
	}
	
	public static void ll(){
		LinkedList<String> names = new LinkedList<>();
		names.add("anant");
		names.add("Ramya");
		names.add("Nihar");
		publ(names);
		System.out.println("==========");
		names.addFirst("My_name");
		publ(names);
		Stream myStream= names.stream();
		/*Predicate<String> p = new Predicate<String>(String name) {
			return (name,2)
		};*/
		//myStream.anyMatch("anant");
	}
	public static void publ(LinkedList<String> names) {
		// TODO Auto-generated method stub
		Iterator<String> itr =  names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}