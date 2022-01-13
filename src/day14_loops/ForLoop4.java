package day14_loops;

public class ForLoop4 {
	public static void main(String args[]) {

		/*
		 * System.out.println("Hello"); System.out.println("Hello");
		 * System.out.println("Hello"); System.out.println("Hello");
		 * System.out.println("Hello");
		 * for(initialization;condition;incr/decr){  
		 * //statement or code to be executed   }  
		 */

		for (int i = 0; i < 10; ++i) {
			System.out.println("******************* Hello " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("############### hi " + j);
				for (int k = 0; k < 3; k++) {
					System.out.println("bye " + k);
				}
			}
		}
		for(int i=0;i<50;i++) {
			System.out.println(i);
			i=i+4;
		}
		
		for(int i=1;i<10;i++) {
			if(!(i%2==0)) {
			System.out.println(i);
			}			
		}
	}
}