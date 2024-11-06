// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int max = Integer.parseInt(args[0]);
		double a =(Math.random() * max);
		double b =(Math.random() * max);
		double c =(Math.random() * max);

		System.out.println(" " + (int)(a)+ " " + (int)(b) + " " + (int)(c));

		double min1 = Math.min(a,b);
		double min2 = Math.min(min1,c);
		double max1 = Math.max(a, b);
		double max2 = Math.max(max1, c);
		double mid = ((a+b+c)- (min2+max2));
		System.out.println(" " + (int)(min2)+ " " + (int)(mid) + " " + (int)(max2));




	}
}

