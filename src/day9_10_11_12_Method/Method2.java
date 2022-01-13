package day9_10_11_12_Method;

public class Method2 {

	static double x = 10, y = 20, z = 30;

	// static double x,y,z;
	public static void main(String[] args) {
		// x=10;
		// y=20;
		// z=30;
		System.out.println("Input the first number: " + x);
		System.out.println("Input the second number: " + y);
		System.out.println("Input the third number: " + z);
		//System.out.println("The average value is " + Method2.average());
		//average();
		double res=Method2.average();
		System.out.println("Average: "+res);
		
		System.out.println("New Average: "+average(12, 15, 17));
		System.out.println("New Average: "+average(22, 55, 18));
		System.out.println("New Average: "+average(15, 15, 17));
		int p=55,q=58,r=82;
		System.out.println("New Average2: "+average(p,q,r));
	}
	public static double average(int a,int b,int c) //int a=12,int b=15,int c=17;
													//int a=p=55,int b=q=58,int c=r=82;
	{
		return (a+b+c)/3;
	}
	public static double average() {
		return (x + y + z) / 3;
	}
	
	//Addition of two numbers
	//Multiplication of two numbers
	//division of two number
}
