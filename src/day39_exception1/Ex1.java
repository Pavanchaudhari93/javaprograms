package day39_exception1;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("***progms starts from here***");
		Ex1 obj=new Ex1();
		obj.division(20,0);
		obj.addition(10,30);
	}

	public void addition(int i, int j) {
		System.out.println("*** addition start from here***");
		int sum=i+j;
		System.out.println("addiition="+sum);
		
	}

	public void division(int i, int j) {
		try  {
			System.out.println("***division start from here***");
			int div =i/j;
			System.out.println("dividion="+div);
		}
		catch(ArithmeticException obj) {
			obj.printStackTrace();
			System.out.println("Exception handled");
		}
		
	}

}
