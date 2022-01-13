package day34_String;

import java.util.Scanner;

class count {
	
	static void Stringwordcount() {
		
		String s = "pavan";
		String s2 = s.concat(" hemchandra chaudhari");
		System.out.println(s2);
		System.out.println("Enter a additional string start with ' SPACE ' ");
		Scanner sc = new Scanner(System.in);
		String s1 = s2.concat(sc.nextLine());
		sc.close();
		System.out.println(s1);
		int count = 1;
		for(int i = 0; i < s1.length(); i++){
			if((s1.charAt(i) == ' ') && (s1.charAt(i+1) != ' ')) {
				count++;
			}
		}
		System.out.println("Total Numbert of Word is : "+count);
	}
}
public class StringClass2 {
	
	public static void main(String[] args) {
		count.Stringwordcount();
	}

}
