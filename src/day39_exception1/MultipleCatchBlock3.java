package day39_exception1;

public class MultipleCatchBlock3 {

	public static void main(String[] args) {
		System.out.println("*** prgm starts from here ***");
		int a=10,b=2;
		try {
			System.out.println("step 1");
			int div=a/b;
			System.out.println("division:"+div);
			System.out.println("step 2");
			int[] arr= {10,20,30};
			System.out.println("array int :"+arr[5]);
			System.out.println("step 3");
			String str="pune";
			System.out.println("chat at 3:"+str.charAt(3));
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(ArithmeticException obj) {
			obj.printStackTrace();
		} catch(StringIndexOutOfBoundsException s) {
			s.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block will executed always");
		}
		System.out.println("prgms end here");
	}

}
