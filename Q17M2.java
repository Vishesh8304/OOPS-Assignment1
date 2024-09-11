public class Q17M2 {
    public static void main(String[] args) {
      int n1 = 72, n2 = 120;
  
      int gcd = findGCD(n1, n2);
      int lcm = (n1 * n2) / gcd;
  
      System.out.println("The LCM of " + n1 + " and " + n2 + " is = " + lcm );
      
    }
  
    public static int findGCD(int a, int b) {
      if (b == 0)
        return a;
      return findGCD(b, a % b);
    }
  }