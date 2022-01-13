package day45_collection1;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		
		arr.add(50);
		arr.add(new Integer(20));
		arr.add("Pune");
		arr.add(50.55f);
		arr.add(true);
		arr.add(new Character('D'));
		arr.add('Z');
		System.out.println(arr);
		System.out.println("size:"+arr.size());
		
//		get particular position array
		System.out.println("**********************");
		System.out.println("4th index data: "+arr.get(4));
		System.out.println("index data :"+arr.get(arr.size()-1));
		
//		by using for loop
		System.out.println("**********************");
		System.out.println("by using for loop");
		for(int i=0 ; i<arr.size() ; i++) {
			System.out.print(" "+arr.get(i));
		}
//		by using for each loop
		System.out.println();
		System.out.println("**********************");
		System.out.println("by using for each loop");
		for(Object obj : arr) {
			System.out.print(" "+obj);
		}
//		set index
		System.out.println();
		System.out.println("**********************");
		arr.set(1, "Mumbai");
		System.out.println(arr);
		System.out.println("size:"+arr.size());
		
//		add and set some value
		System.out.println();
		System.out.println("**********************");
		System.out.println("add and set some value");
		arr.add(null);
		arr.add("Burhanpur");
		System.out.println(arr);
		System.out.println("size:"+arr.size());
		
		arr.set(1,"Jalgaon");
		arr.set(3,false);
		System.out.println(arr);
		System.out.println("size:"+arr.size());
	}

}
