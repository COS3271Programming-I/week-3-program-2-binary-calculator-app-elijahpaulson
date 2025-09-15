package BinaryCalculatorAPP;
import java.util.Scanner;
public class BinaryCalculatorAPP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// get user input and format as integer
		System.out.print("Enter a binary number:");
		String s = userinput.nextLine();
		int x = Integer.parseInt(s,2);
		System.out.print("Enter another binary number:");
		String n = userinput.nextLine();
		int y = Integer.parseInt(n,2);
		
		// calculate and display results
		System.out.print("Sum: " + Integer.toBinaryString(x+y));
		System.out.print("\nDifference: " + Integer.toBinaryString(x-y));
		System.out.print("\nProduct: " + Integer.toBinaryString(x*y));
		System.out.print("\nQuotient: " + Integer.toBinaryString(x/y));
	}

}
