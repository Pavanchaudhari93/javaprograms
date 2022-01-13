package day43_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap2 {

	public static void main(String[] args) {
		Map<String,String> unsortedHashMap=new HashMap<>();
		unsortedHashMap.put("apple", "apple");
		unsortedHashMap.put("banana", "banana");	
		unsortedHashMap.put("orange", "orange");
		unsortedHashMap.put("guava", "guava");
		
		for(Map.Entry<String,String> entry:unsortedHashMap.entrySet()) {
			System.out.println("key value="+entry.getKey());
		}
		Map<String,String> sortedtreemap=new TreeMap<String,String>(unsortedHashMap);
		for(Map.Entry<String,String> entry:sortedtreemap.entrySet()) {
			System.out.println("Sorted key value="+entry.getKey());
		}
	}

}
