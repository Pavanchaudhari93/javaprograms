package day20_finalkeyword;

public class FinalKeyword2 {

	final int speedlimit;// blank final variable
	FinalKeyword2() {
		speedlimit = 70;
		System.out.println("sprrdlimit: "+speedlimit);
//		speedlimit=80;    //final can not be reinitialize
	}
	public static void main(String args[]) {
		FinalKeyword2 f1=new FinalKeyword2();
		System.out.println("speedlimit: "+f1.speedlimit); 
	}
}