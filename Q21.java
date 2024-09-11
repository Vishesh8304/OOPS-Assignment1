import java.util.Scanner;

public class Q21 {

    // Convert binary to decimal
    public static int binToDec(String bin) {
        int dec = 0;
        int len = bin.length();
        
        for (int i = 0; i < len; i++) {
            char ch = bin.charAt(len - 1 - i);
            if (ch == '1') {
                dec += Math.pow(2, i);
            }
            // No error handling; assume input is valid binary
        }
        
        return dec;
    }

    // Convert decimal to binary
    public static String decToBin(int dec) {
        if (dec == 0) return "0";
        
        String bin = "";
        while (dec > 0) {
            bin = (dec % 2) + bin;
            dec /= 2;
        }
        
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number to convert to decimal: ");
        String bin = sc.nextLine();
        
        System.out.print("Enter decimal number to convert to binary: ");
        int dec = sc.nextInt();
        sc.close();

        int decResult = binToDec(bin);
        System.out.println("Binary to Decimal: " + decResult);

        String binResult = decToBin(dec);
        System.out.println("Decimal to Binary: " + binResult);
    }
}
