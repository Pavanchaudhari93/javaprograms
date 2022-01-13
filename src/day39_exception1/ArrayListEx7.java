package day39_exception1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx7 {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		str.add("pavan");
		str.add(null);
		str.add("Dimple");
		str.add(new String("24"));
		str.add("vaibhavee");
		str.add("25");
		str.add("India");
		System.out.println("str = "+str);
		
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("Jalgaon");
		str1.add(null);
		str1.add("MP");
		str1.add(new String("24"));
		str1.add("vaibhavee");
		str1.add("60");
		str1.add("India");
		System.out.println("str1 = "+str1);
		
//		str.removeAll(str1);
//		System.out.println("str = "+str);
//		System.out.println("str1 = "+str1);
		
//		str.retainAll(str1);
//		System.out.println(str.retainAll(str1));
//		System.out.println("str = "+str);
//		System.out.println("str1 = "+str1);
		
		List<String> str2 = str1.subList(1, 5);
		System.out.println("str2:"+str2);
		System.out.println("str = "+str);
		System.out.println("str1 = "+str1);
		
		
		
		
		
	}

}
