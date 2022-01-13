package day39_exception1;

import java.io.IOException;
//import java.sql.SQLException;

public class ThrowEx {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("*** prgm starts from here ***");
		ThrowEx obj=new ThrowEx();
//		try {
			obj.test1();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("*** prgms ends here ***");
	}

	private void test1() throws IOException, InterruptedException {
		System.out.println("inside test");
		int i=10;
//		throw new SQLException("Input output exception");   //this is run time exception
		if(i>5) {
			throw new IOException("Input output exception");
		}else {
			throw new InterruptedException("Input output exception");
		}
		
	}

}
