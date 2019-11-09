package fibonacciLoop;

public class FiboCheck {
	
public static void display(int n) {
		
	int num0 = 0, num1 = 1, sum = 0;
	
	// two fibonacci initial elements displayed
	System.out.print(num0 + " " + num1 + " ");
		
	for (int j =1; j<=n-2; j++)
	{
		sum = num0 + num1;
		num0 = num1;
		num1 = sum;
		System.out.print(sum + " ");
	}
	
}
}
