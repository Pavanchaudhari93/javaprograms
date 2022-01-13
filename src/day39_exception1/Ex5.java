package day39_exception1;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println("*** prgm starts from here ***");
		int a=10,b=0;
		try {
			System.out.println("step 1:");
			int div=a/b;
			System.out.println("division: "+div);
			int[] arr= {10,20,30};
			System.out.println(arr[2]);
		} catch(ArithmeticException e){
			System.out.println("step 2:");
			e.printStackTrace();
			
		}finally {
			System.out.println("inside finally block");
			int div1=50/0;
			System.out.println(div1);
			System.out.println("finally block completed");
		}
	
		System.out.println("*** prgms ends here");
	}

}
