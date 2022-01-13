package day39_exception1;

public class CompileTimeException {

	public static void main(String[] args) {
		System.out.println("*** prgm starts from here ***");
		try {
			System.out.println("step 1:");
			for(int i=0 ; i<10 ; i++) {
				Thread.sleep(2000);
				System.out.println(" "+i);
			}
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
			System.out.println("*** prgms end here ***");
	}

}
