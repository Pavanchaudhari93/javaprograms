package day39_exception1;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListEx6 {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		str.add("pavan");
		str.add(null);
		str.add("Dimple");
		str.add(new String("24"));
		str.add("vaibhavee");
		str.add("25");
		str.add("India");
		System.out.println(str);
		System.out.println("Size:"+str.size());
		str.remove(1);
		str.remove("vaibhavee");
		System.out.println(str);
		System.out.println("Size:"+str.size());
		
		System.out.println(str.get(0));
		if(str.get(1)=="Dimple") {
			System.out.println(str.get(1));
		}
	}

}
