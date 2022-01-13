package day9_10_11_12_Method;

public class Method02 {
	// static global variables
	static int age;
	static double salary;	
	//static method with return value no argument
	public static int test1() {
		System.out.println("I am test1 method.");
		//logic		
//		int pin=201201;
//		return pin;
		return 201201;
	}
	//static method without return value no argument
	static void test2() {
		System.out.println("I am test2 method");
		//return; this will be written by java compiler at compile
	}
	//static method with return value along with argument
	public static double print(int a) {
		System.out.println("static method with return value along with argument");
		return 20.62;
	}
	
	//static method without return value along with argument
	static void print2(double d) {
		System.out.println("static method without return value along with argument");
	}
	
	public static void main(String[] args) {
		Method02.test1();
		Method02.test2();
		Method02.print(10);
		Method02.print2(20d);
	}
}
