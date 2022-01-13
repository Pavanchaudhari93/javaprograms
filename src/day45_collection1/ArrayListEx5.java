package day45_collection1;

import java.util.ArrayList;

public class ArrayListEx5 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(new Integer(10));
		arr.add(30);
		arr.add(null);
		arr.add(434);
		arr.add(34);
		arr.add(20);
		arr.add(null);
		arr.add(38);
		System.out.println(arr);
		System.out.println("size:"+arr.size());
		arr.remove(3);
		arr.remove(new Integer(20));
		System.out.println(arr);
		System.out.println("size:"+arr.size());

	}

}
