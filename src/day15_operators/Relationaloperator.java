package day15_operators;

public class Relationaloperator {

	public static void main(String[] args) {
		
		int num1 = 30 , num2 = 20;
		
		System.out.println("num1 : "+num1 +" and num2 : "+num2);
		// is equal to
		System.out.println("num1 == num2 = " + (num1 == num2));//false
		// is not equal to
		System.out.println("num1 != num2 = " + (num1 != num2));//true
		// Greater than
		System.out.println("num1 >  num2 = " + (num1 > num2));// true
		// Less than
		System.out.println("num1 <  num2 = " + (num1 < num2));// false
		// Greater than or equal to
		System.out.println("num1 >= num2 = " + (num1 >= num2));//true
		// Less than or equal to
		System.out.println("num1 <= num2 = " + (num1 <= num2));//false

	}

}
