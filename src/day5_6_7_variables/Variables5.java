package day5_6_7_variables;

public class Variables5 {
	   
	   // salary  variable is visible in Employee class only.
	   double salary=75989.708;

	   public static void main(String args[]) {
	      Variables5 empOne = new Variables5();
	      System.out.println("salary :" + empOne.salary);//75989.708
		  empOne.salary=85000.78;
		  System.out.println("salary :" + empOne.salary);//15000.78
		  
		  Variables5 empOne1 = new Variables5();
		  System.out.println("salary :" + empOne1.salary);//75989.708

		   Variables5 empOne2 = new Variables5();
		  System.out.println("salary :" + empOne2.salary);//75989.708
	   }
}