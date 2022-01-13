package interviewpeograms;

import java.util.Scanner;

//2.Java Program to Swap two numbers without using third variable
public class SwapTwoNo {

	public void swap () {
		int a, b ;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first No a : ");
		a = scan.nextInt();
		System.out.print("Enter second No b : ");
		b = scan.nextInt();
		scan.close();
//		swapping
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping \nValue of a is : "+a+" \nand Value of b is : "+b);
	}
	public static void main(String[] args) {
		
		SwapTwoNo O = new SwapTwoNo();
		O.swap();

	}
}
