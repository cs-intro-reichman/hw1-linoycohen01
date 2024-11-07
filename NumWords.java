// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int x = 123; 
		int ones = (x % 10);
		int x = (x / 10);
		System.out.println(ones);
		int hundreds = (x%10);
		
	}
}
