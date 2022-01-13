package interviewpeograms;

import java.util.Scanner;

//5. Java Program to Reverse Number
public class ReverseNo {
	 static void reverse() {
		 int d, a, rev=0;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a Number : ");
		 d = scan.nextInt();
		 scan.close();
		 
		 while(d>0) {
			 a = d%10;
			 rev = rev*10+a;
			 d = d/10;
		 }
		 System.out.println("Reverse Number of given No of : "+rev);
	 }

	public static void main(String[] args) {
	
		ReverseNo.reverse();
	}
}
