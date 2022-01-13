package day34_String;

public class StringDemo {
	public static void main(String[] args) {

	StringDemo s1 = new StringDemo();
	System.out.println("s1 : "+s1);
	System.out.println("s1 hashcode : "+s1.hashCode());
	System.out.println("s1 toString : "+s1.toString());
	System.out.println("s1 getClass : "+s1.getClass());
	
	System.out.println("********************************************");
	
	String s2 = new String("Pune is IT Hub");
	System.out.println("s2 : "+s2);
	System.out.println("s2 hashcode : "+s2.hashCode());
	System.out.println("s2 toString : "+s2.toString());
	System.out.println("s2 getClass : "+s2.getClass());
	
	}

}
