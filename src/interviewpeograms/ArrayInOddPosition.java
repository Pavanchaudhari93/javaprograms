package interviewpeograms;

public class ArrayInOddPosition {

	public static void main(String[] args) {
		int []arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Element of given array present in odd position:");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Element of given array present in even position:");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}

}
