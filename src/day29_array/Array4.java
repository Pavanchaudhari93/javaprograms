package day29_array;

class Minmaxarr {
	
	static void min(int arr[]) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i]) 
				min = arr[i];
		}
		System.out.println("Minimum Number in this array is : "+min);
	}
	
	static void max(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i])
			max = arr[i];
		}
		System.out.println("Maximun Number in this array is : "+max);
	}
}

public class Array4{
	public static void main(String[] args) {
		int []a = {4,9,10,15,55,2,6,19};
		Minmaxarr.min(a);
		Minmaxarr.max(a);
	}
	
	
	
	
}