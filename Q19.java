import java.util.Scanner;

public class Q19 {

    public static boolean isPal(int num) {
        int orig = num;
        int rev = 0;

        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        return orig == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (isPal(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
}
