package interviewpeograms;

import java.util.Scanner;

//8.Write a java program to find Palindrome number  121=121
public class PalindromeNo {

	public void palin() {
	int a,b,c,res=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	a = sc.nextInt();
	sc.close();
	b=a;
	
	while(a>0) 
	{
		c=a%10;
		res=res*10+c;
		a=a/10;
	}
	if(res==b) {
		System.out.println("Given Number is Palindrom");
	}else {
		System.out.println("Given Number is Not Palindrom");
	}
	}
	public static void main(String[] args) {
		PalindromeNo p = new PalindromeNo();
		p.palin();
	}
}
