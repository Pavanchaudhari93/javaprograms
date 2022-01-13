package day39_exception1;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("*** prgm starts from here ***");
		int a=10,b=0;
		try {
			System.out.println("step 1:");
			int div=a/b;
			System.out.println("division: "+div);
			int[] arr= {10,20,30};
			System.out.println(arr[2]);
		} catch(ArrayIndexOutOfBoundsException obj) {
			obj.printStackTrace();
			System.out.println("array inside catch");
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("*** prgms ends here");
	}

}
