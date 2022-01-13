package day43_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<String,Integer> marks=new HashMap<String,Integer>();
		marks.put("pavan", 100);
		marks.put("dimple", 200);
		marks.put("vaibhavee", 300);
		marks.put("pankaj", 400);
		
		marks.put(null, 500);
		
		System.out.println(marks.hashCode());
		System.out.println(marks.toString());
		System.out.println(marks.size());
		System.out.println(marks.get("pavan"));
		/*
		 * hashcode of pavan-->
		 * index=
		 * .equals to check the key name
		 * pavan
		 * return value
		 */
		

	}

}
