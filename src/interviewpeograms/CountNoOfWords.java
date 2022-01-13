package interviewpeograms;

import java.util.HashMap;

public class CountNoOfWords {

	public static void main(String[] args) {
		
		String str="This is Pavan Pavan Chaudhari Chaudhari";
		String[] split=str.split(" ");
		
		HashMap<String,Integer> m1=new HashMap<String,Integer>();
		for(int i=0;i<split.length;i++) {
			if(m1.containsKey(split[i])) {
				int count=m1.get(split[i]);
				m1.put(split[i], count+1);
				}
			else {
				m1.put(split[i],1);
			} 
		}
			System.out.println(m1);
	}
}
/*Answer:  This is a collection class program where we have used HashMap for storing the string.

First of all, we have declared our string variable called str. Then we have used split() function delimited 
by single space so that we can split multiple words in a string.

Thereafter, we have declared HashMap and iterated using for loop. Inside for loop, we have an if-else 
statement in which wherever at a particular position, the map contains a key, we set the counter at that 
position and add the object to the map.

Each time, the counter is incremented by 1. Else, the counter is set to 1.

Finally, we are printing the HashMap.

Note: The same program can be used to count the number of characters in a string. All you need to do
 is to remove one space (remove space delimited in split method) in String[] split = str.split(��);

*/