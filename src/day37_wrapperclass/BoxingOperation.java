package day37_wrapperclass;

public class BoxingOperation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		int age=20;
		System.out.println("Age: "+age);
		Integer intObj1=new Integer(age);//explicit boxing operation
		System.out.println("intObj1: "+intObj1);
		System.out.println(age==intObj1);
		Integer intObj2=new Integer(50);//explicit boxing operation
		System.out.println("intObj2: "+intObj2);
		Integer intObj3=60;//implicit boxing operation or auto boxing operation
		System.out.println("intObj3: "+intObj3);
	}
}