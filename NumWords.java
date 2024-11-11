// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int x = Integer.parseInt(args[0]);
		int ones = (x % 10);
		x = (x / 10);
		int tens = (x%10);
		x = (x/10);
		int hundreds = x;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

		
	}
}
