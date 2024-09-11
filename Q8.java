import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int divisor = scanner.nextInt();
        
        if (divisor != 0) {
            if (number % divisor == 0) {
                System.out.println(number + " is divisible by " + divisor);
            } else {
                System.out.println(number + " is not divisible by " + divisor);
            }
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

