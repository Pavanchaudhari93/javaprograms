package interviewpeograms;

import java.util.Scanner;

//1.Java Program to Find Odd or Even number
public class EvenOddNo {
	
	public void findevenoddno () {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int A = scan.nextInt();
		scan.close();
		int res = A % 2;
		 
		if(res==0) {
			System.out.println("Given Number is Even");
		}else {
			System.out.println("Given Number is Odd");
		}
	}
		public static void main(String[] args) {

			EvenOddNo S = new EvenOddNo();
			S.findevenoddno();
	
	}
}
