package day39_exception1;

public class TryBreak {

	public static void main(String[] args) {
		System.out.println("*** prgm starts from here ***");
		try {
			System.out.println("step 1:");
			for(int i=1 ; i<=10 ; i++) {
				if(i==5) {
					break;
				}
				System.out.println(i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("*** prgms ends here");
	}

}
