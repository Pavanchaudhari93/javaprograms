package day15_operators;

public class Unaryoperator1 {
		public static void main(String[] args) {

			int a = 10;
			int b = a;
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			/**
			 * pre: first perform the operation dn use the updated value 
			 * post: first use the value dn perform the operation
			 */
			int k = ++a;// a=a+1;---> k=11 a=11
			System.out.println("k: " + k);
			System.out.println("a: " + a);
			int j = k++;// k=k+1 --->j =11 k=12
			System.out.println("k: " + k);
			System.out.println("j: " + j);

			int r = 17;
			System.out.println("r=: " + r++);//17
			System.out.println("r=: " + r);//18
			System.out.println("r=: " + ++r);//19 
			System.out.println("r=: " + r);//19

			int x = 56;
			System.out.println("x=: " + --x);// 55
			System.out.println("x=: " + x);// 55
			System.out.println("x=: " + x--);// 55
			System.out.println("x=: " + x);// 54
	}
}
