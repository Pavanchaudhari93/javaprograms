package day39_exception;

public class ExceptionHandling13 {

	    public static void main(String[] args)
	    {
	    	System.out.println("program starts");
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("printstacktrace");
				e.printStackTrace();
			}
	        System.out.println("Hello Geeks");
	    }
}