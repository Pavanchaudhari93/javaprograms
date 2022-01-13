package day37_singleton;

public class Singleton {
	/*
	 * in oop a singleton class ia a class that can have only one object or instance of class at a time
	 * how to design singleton class
	 * 1. make sure constructor as private
	 * 2.write a public static method that has return type of object of this singleton class(lazy initialization
	 *
	 *diff bw singleton and nad normal class
	 *for normal class we use constructor whereas for singleton classwe use getInstance() for instantiation
	 */
	private static Singleton st=null;
	public String str;
	
	private Singleton() {
		str="Hey im using Singleton class";
	}
	
	public static Singleton gatInstance() {
		if (st==null) 
			st=new Singleton();
			return st;
	}
	public static void main(String[] args) {
		Singleton x=Singleton.gatInstance();
		Singleton y=Singleton.gatInstance();
		Singleton z=Singleton.gatInstance();
		
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str=(x.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}
}
