package day39_exception1;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("*** prgm starts from here ***");
		int a=10,b=2;
		try {
			System.out.println("step 1");
			int div=a/b;
			System.out.println("division:"+div);
			System.out.println("step 2");
			int[] arr= {10,20,30};
			System.out.println("array int :"+arr[2]);
			System.out.println("step 3");
			String str="pune";
			System.out.println("chat at 5:"+str.charAt(5));
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(ArithmeticException obj) {
			obj.printStackTrace();
		} catch(StringIndexOutOfBoundsException s) {
			s.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("prgms end here");
	}

}
