import java.util.Scanner;

public class Q29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Array to keep track of visited elements
        boolean[] visited = new boolean[n];

        System.out.println("Duplicate elements and their frequencies:");
        for (int i = 0; i < n; i++) {
            // Skip the element if it's already been counted
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark this element as counted
                }
            }

            // Print the count of the element if it's more than 1
            if (count > 1) {
                System.out.println(arr[i] + ": " + count);
            }
        }
    }
}
