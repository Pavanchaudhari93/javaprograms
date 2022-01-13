package day29_array;

class Testreturnarray {
	static int[] getarray( ){
		return new int[] {1,2,3,4,5,6};
		}
}
public class array5{
	public static void main(String[] args) {
		
		int arr[] = Testreturnarray.getarray();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+" ");
		}
		
	}
}
