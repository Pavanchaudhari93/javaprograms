package interviewpeograms;

import java.util.Scanner;

//3.Write a java program to find Prime number
public class PrimeNo {
	
	public static void prime() {
		double d ;
		boolean res = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		d = s.nextDouble();
		s.close();
		if(d==1) {
			System.out.println("Smallest Prime No is 2");
		}
		for(int i=2 ; i<d ; i++) {
			if(d%i == 0) {
				res = true;
				break;
			}
		}
			if(!res) {
				System.out.println("Given Number is Prime No : "+d);
			}else {
				System.out.println("Given Number is Not Prime No : "+d);
			}
		}
	
	public static void main(String[] args) {
		
		PrimeNo.prime();
	}
}
