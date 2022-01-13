package day14_loops;

public class ForLoop {
	public static void main(String args[]) {

//		System.out.println("Hello Everyone, Good Morning...");
//		System.out.println("Hello Everyone, Good Morning...");
//		System.out.println("Hello Everyone, Good Morning...");
//		System.out.println("Hello Everyone, Good Morning...");
//		System.out.println("Hello Everyone, Good Morning...");

		for (int i = 0; i <= 15; i++) {
			System.out.println("Index: " + i + " Hello Everyone, Good Morning...");
		}

		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("*************Reverse****************");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("******************************");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.println(c1);
		}
		System.out.println("******************************");
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.println(c1);
		}
		System.out.println("******************************");
	 	for(char c1='z';c1>='a';c1--) {
	 		System.out.println(c1);
	 	}
	}
}
