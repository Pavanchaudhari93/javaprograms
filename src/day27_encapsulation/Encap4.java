package day27_encapsulation;

public class Encap4 {
	public static void main(String[] args) {
		// creating instance of Account class
		Account acc = new Account();
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setName("Sonoo Jaiswal");
		acc.setEmail("absc@gmail.com");
		acc.setAmount(500000f);
		// getting values through getter methods
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getName());
		System.out.println(acc.getEmail());
		System.out.println(acc.getAmount());
	}
}

class Account {

	public void setAcc_no(long l) {
		
	}

	public void setName(String string) {
		
	}

	public void setEmail(String string) {
		
	}

	public void setAmount(float f) {
		
	}

	public char[] getAcc_no() {
		return null;
	}

	public char[] getName() {
		return null;
	}

	public char[] getEmail() {
		return null;
	}

	public char[] getAmount() {
		return null;
	}

}