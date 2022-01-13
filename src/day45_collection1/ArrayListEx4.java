package day45_collection1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx4 {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(54);
		arr.add(30);
		arr.add(32);
		arr.add(10);
		arr.add(40);
		arr.add(25);
		System.out.println(arr);
		
		ListIterator<Integer> itr=arr.listIterator();
//		System.out.println("before traverse :"+itr.hasPrevious());
//		itr.next();
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println("before traverse :"+itr.hasPrevious());
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
