package question;

class poly123{
	
	poly123(){
	System.out.println("parent");
	}
	public void demo(){
	System.out.println("parent");
	}

	public void demo(int a){
	System.out.println("p2");
	}
}
class poly21 extends poly123{
	poly21(){
	System.out.println("parent12");

	}
	void m2(){
	System.out.println("parent13");
	}
}
public class polym{
public void main(String[] args){
	
	poly21 p1=new poly21();
	p1.demo();
	p1.demo(3);
	p1.m2();
}
}


