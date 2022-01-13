package interviewpeograms;

import java.util.Scanner;

//4. Java Program to Find Factorial on Number
public class FactorialNo {

	public void factorial() {
		double d , res=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		d = scan.nextDouble();
		scan.close();
		
		for(double i=d; i>0; i--) {
			res = res*i;
		}
		System.out.println("Factorial of given "+d+ " is :"+res);
	}
	public static void main(String[] args) {
		FactorialNo obj = new FactorialNo();
		obj.factorial();
	}

}
