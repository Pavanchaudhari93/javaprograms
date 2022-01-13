package interviewpeograms;

//6. Java Program to print Fibonacci Series
public class FibonacciSeries {

	public static void main(String[] args) {
		int i=1, n=20, first=0, second=1;
		System.out.println("Fibonacci series upto "+n+" terms is: ");
		while(i<=n) {
			System.out.print(first+", ");
			int next = first + second;
			first = second;
			second = next;
			i++;
		}
	}
}
