public class Q16M2 
{
    // Gcd of x and y using recursive function 
	static int HCF(int x, int y) 
	{ 
		// Everything is divisible by 0 
		if (x == 0) 
			return y; 
		if (y == 0) 
			return x; 

		// Both the numbers are equal 
		if (x == y) 
			return x; 

		// x is greater 
		if (x > y) 
			return HCF(x - y, y); 
		return HCF (x, y - x); 
	} 

	// The Driver method 
	public static void main(String[] args) 
	{ 
		int x = 100, y = 88; 
		System.out.println("Highest Common Factor of " + x + " and " + y 
						+ " is " + HCF(x, y)); 
	} 
}
