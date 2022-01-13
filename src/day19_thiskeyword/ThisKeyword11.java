package day19_thiskeyword;

class Student1 {
	//Global Var
	int rollno;	//0 -->111 --->112
	float fee;//0.0	--->5000 --->6000
	Student1(int rollno, float fee) {
		System.out.println("local rollno : "+rollno);
		System.out.println("local fee : "+fee);
		System.out.println("intial global rollno : "+this.rollno);
		System.out.println("intialglobal fee : "+this.fee);
	//  Global Var = Local Var;
		this.rollno = rollno;	  
		this.fee = fee;
		System.out.println("after update, global rollno : "+this.rollno);//111
		System.out.println("after update, intialglobal fee : "+this.fee);//5000
	}
	void display() {
		System.out.println(rollno + " "+ fee);//111 5000
	}
}
public class ThisKeyword11 {
	public static void main(String args[]) {
		Student1 s1 = new Student1(111, 5000f);
		s1.display();
		Student1 s2 = new Student1(112, 6000f);		
		s2.display();
	}
}