package interviewpeograms;

import java.util.Scanner;

//7. Write a java program to find Armstrong number(a no is equal to sum of the cubes of its own no.) 
public class ArmstrongNumber {
	public static void armstrong() {
		int a, b, c = 0, res=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		a = scan.nextInt();
		scan.close();
		c=a;
		while(a>0) {
			b = a%10;
			a = a/10;
			res = res+ b*b*b;
		}
		if(res==c) {
			System.out.println("Given Number is Armstrong");
		}else {
			System.out.println("Given Number is Not Armstrong");
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber.armstrong();
	}
}
