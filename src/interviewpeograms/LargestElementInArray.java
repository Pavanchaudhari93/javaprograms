package interviewpeograms;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[]=new int[] {21,2,22,65,33,5,1,55};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Largest Element present in arr is: "+max);
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Largest Element present in arr is: "+min);
	}

}
