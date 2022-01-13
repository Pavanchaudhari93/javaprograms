package day45_collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		
		ArrayList<Object> a2 = new ArrayList<Object>();
		a2.add(10);
		a2.add("pavan");
		a2.add('p');
		System.out.println(a2);
		
		ArrayList<Object> a3 = new ArrayList<Object>();
		a3.add(11.54);
		a3.add("dimple");
		a3.add('d');
		System.out.println(a3);
		
		HashMap<Integer,ArrayList<Object>> h1=new HashMap<Integer,ArrayList<Object>>();
		h1.put(1, a1);
		h1.put(2, a2);
		h1.put(3, a3);
		System.out.println(h1);
		
		Set<Integer> s1 = h1.keySet();
		System.out.println(s1);
		
		Collection<ArrayList<Object>> c1 = h1.values();
		System.out.println(c1);

	}

}
