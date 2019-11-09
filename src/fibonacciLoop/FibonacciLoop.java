package fibonacciLoop;
// Display Fibonacci series of n size using loop
import java.util.Scanner;

public class FibonacciLoop {

	public static void main(String[] args) {
		// Scanner object
		Scanner myObj = new Scanner(System.in);
		// Prompt user
		System.out.println("Please enter how many fibonacci series elements to display");
		int x = myObj.nextInt();
		myObj.close();
		FiboCheck.display(x);
	}

}
