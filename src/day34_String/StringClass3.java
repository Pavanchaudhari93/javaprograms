package day34_String;

import java.util.Scanner;

public class StringClass3 {

		static void charAtString() {
			String s; 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String to be cheched");
			s = sc.nextLine();
			
			for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
		}
			System.out.println("\nReverse String ");
			for(int i = s.length()-1; i >= 0; i--) {

			System.out.print(s.charAt(i)+" ");
	
		}
	}
		static void checkpalindrome() {
			System.out.println("Enter a String to be cheched");
			String s, temp = "";
			Scanner sc = new Scanner(System.in);
			s = sc.nextLine();
			System.out.println("Check string is palindrome or not");
			for(int i = s.length()-1; i >= 0; i--) {
			temp = temp + s.charAt(i);
			sc.close();
		}
		if(s.equals(temp)) {
			System.out.println("Given String is palindrome: "+temp);
		}else {
			System.out.println("Given String is not palindrome: "+temp);
		}
	}
		public static void main(String[] args) {
		StringClass3.charAtString();
		System.out.println("\n*******************************");
		StringClass3.checkpalindrome();
	}
}
