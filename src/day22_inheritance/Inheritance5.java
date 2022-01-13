package day22_inheritance;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class C3 extends A2,B2{
	
	C3(){
		super();//confusion 
	}
}	
	
	public class Inheritance5{
	public static void main(String args[]) {
		C3 obj = new C3();
		obj.msg();
	}
}