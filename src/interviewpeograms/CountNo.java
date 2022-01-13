package interviewpeograms;

import java.util.Scanner;

//9. Write a java program to find number of digits in given number
public class CountNo {
	
	static void count() {
		long d,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		d = sc.nextLong();
		sc.close();
		while(d>0)
		{
			d=d/10;
			++count;
		}
		System.out.println("Total Number of digit is: "+count);
	}
	public static void main(String[] args) {
		CountNo.count();

	}
}
