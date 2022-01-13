package question;

	class poly{
		
		poly(){
		System.out.println("parent");
		}
		public void demo(){
		System.out.println("parent");
		}
		public void demo(int a){
		System.out.println("p2");
		}
	}
	class poly2 extends poly{
		poly2(){
		System.out.println("parent12");
		}
		public void m2(){
		System.out.println("parent13");
		}
	}
	public class polymorphiss{
		
	public static void main(String[] args){
		
		poly2 p=new poly2();
		p.demo();
		p.demo(3);
		p.m2();
	}
}
