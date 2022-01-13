package day37_singleton;

public class Student {
	/*
	 *create static instance of current class
	 *create class constructor as a private
	 *create static method which should return object of current class
	 *singleton class: A class which allows us to create only one object is called singleton class
	 */
	
	static Student st=new Student();
	private Student() 
	{
		System.out.println("constuctor will invoke only one object");
	}
	
	static Student getinstance() // this method returns object
	{ 		
		return st;
	}
	public static void main(String[] args) {
//		Student st=new Student();
		Student st=Student.getinstance();

	}

}
