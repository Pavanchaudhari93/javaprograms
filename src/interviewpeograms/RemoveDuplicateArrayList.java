package interviewpeograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* 

the simplest approach to remove repeated objects from ArrayList is to copy them to a Set 
e.g. HashSet and then copy it back to ArrayList. This will remove all duplicates  without writing any more code
One thing to noted is that, if original order of elements in ArrayList is important for you, 
as List maintains insertion order, you should use LinkedHashSet because HashSet doesn't provide any 
ordering guarantee.

*/
public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> prime=new ArrayList<Integer>();
		prime.add(2);
		prime.add(6);
		prime.add(2);
		prime.add(9);
		prime.add(6);
		prime.add(8);
		
		// let's print arraylist with duplicate 
		
		System.out.println("list of prime numbers : " + prime); 
		
		// Now let's remove duplicate element without affecting order 
		// LinkedHashSet will guaranteed the order and since it's set 
		// it will not allow us to insert duplicates. 
		// repeated elements will automatically filtered.
		
		Set<Integer> RemoveDuplicateArrayList=new LinkedHashSet<Integer>(prime);
		
		
//		clear the ArrayList so that we Can copy all element from LinkedHashSet
		
		prime.clear();
		
//		copying element but without any duplicate
		
		prime.addAll(RemoveDuplicateArrayList);
		System.out.println("List of prime without duplicate: "+prime);
		
		
	}

}
