import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int count = 0;
      int temp=number ;
        
        if (temp == 0) {
            count = 1;  // Zero has one digit
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }
        
        System.out.println("Number of digits: " + count);
    }
}

