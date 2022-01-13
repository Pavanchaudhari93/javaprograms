package day39_exception1;

public class WithouTtryCatch {

	public static void main(String[] args) {
		System.out.println("***progms starts from here***");
		WithouTtryCatch obj=new WithouTtryCatch();
		obj.division(20,0);
		obj.addition(10,30);
		
	}

	public void division(int i, int j) {
		System.out.println("***division start from here***");
		int div =i/j;
		System.out.println("dividion="+div);
	}

	public void addition(int i, int j) {
		System.out.println("*** addition start from here***");
		int sum=i+j;
		System.out.println("addiition="+sum);
		
	}

}
