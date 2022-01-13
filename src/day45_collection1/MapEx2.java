package day45_collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<Object,Object> h1 = new HashMap<Object,Object>();
		h1.put(1, null);
		h1.put("pavan", 3);
		h1.put("10.3", null);
		h1.put("MP", "Dimple");
		h1.put("character", 'a');
		h1.put(-100, "cat");
		h1.put(-16.54, "object");
		System.out.println(h1);
		
		Set<Object> s1 = h1.keySet();
		System.out.println(s1);
		
		Collection<Object> c1 = h1.values();
		System.out.println(c1);
		

	}

}
