import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Mathematics: ");
            int math = scanner.nextInt();
            
            System.out.print("Physics: ");
            int physics = scanner.nextInt();
            
            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();
            
            int total = math + physics + chemistry;
            
            if ((math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) ||
                (math + physics >= 150)) {
                System.out.println("Student " + (i + 1) + " is eligible.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible.");
            }
        }
    }
}
