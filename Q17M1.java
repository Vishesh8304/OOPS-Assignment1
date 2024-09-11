public class Q17M1
 {
        public static int gcd(int a, int b) {//subtraction method
            // Ensure a is greater than or equal to b
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            
            // Subtraction method to find GCD
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a; // At this point, a and b are equal and thus represent the GCD
        }
    
        // Method to compute the LCM of two numbers
        public static int lcm(int a, int b) {
            // Use the formula: LCM(a, b) = abs(a * b) / GCD(a, b)
            return Math.abs(a * b) / gcd(a, b);
        }
    
        public static void main(String[] args) {
            // Example numbers
            int num1 = 24;
            int num2 = 36;
    
            // Calculate LCM
            int lcmValue = lcm(num1, num2);
    
            // Print the LCM
            System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcmValue);
        }
    }
       

