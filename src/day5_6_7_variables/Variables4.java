package day5_6_7_variables;

public class Variables4 {
	// this non-static or instance global variable
   int empID;//0
   // this non-static or instance global variable
   double salary;//0.0
   public static void main(String args[]) {
      //Object creation
	  //ClassName referenceVariable=new ClassName();
	  Variables4 obj=new Variables4();	  
      System.out.println("obj empID  : " + obj.empID );//0
      System.out.println("obj salary :" + obj.salary);//0.0
	  obj.empID=100;
	  obj.salary=15000.768;
	  System.out.println("updated obj empID  : " + obj.empID );//100
      System.out.println("updated obj salary :" + obj.salary);//15000.768
	  
	  Variables4 obj2=new Variables4();	  
      System.out.println("obj2 empID  : " + obj2.empID );//0
      System.out.println("obj2 salary :" + obj2.salary);// 0.0

	   System.out.println("updated obj empID  : " + obj.empID );//100
      System.out.println("updated obj salary :" + obj.salary);//15000.768

	  Variables4 obj3=new Variables4();	  
      System.out.println("obj3 empID  : " + obj3.empID );
      System.out.println("obj3 salary :" + obj3.salary);
   }
}
