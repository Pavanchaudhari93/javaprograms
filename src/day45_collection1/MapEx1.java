package day45_collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<Integer,String> H1=new HashMap<Integer,String>();
		H1.put(1, null);
		H1.put(2, null);
		H1.put(3, "india");
		H1.put(4, "usa");
		H1.put(5, "uk");
		H1.put(6, "Shrilanka");
		System.out.println(H1);
		System.out.println(H1.get(3));
		System.out.println(H1.get(5));
		
		System.out.println(H1.isEmpty());
		System.out.println(H1.hashCode());
		H1.replace(5, "uk", "london");
		System.out.println(H1);
		H1.remove(2,null);
		System.out.println(H1);
		
		Set<Integer> a1 = H1.keySet();
		System.out.println(a1);
		
		Collection<String> c1 = H1.values();
		System.out.println(c1);
		
	}

}