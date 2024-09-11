import java.util.Scanner;

public class Q22 {

    // Method to sort an array using bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to find the median of an array
    public static double findMedian(int[] arr) {
        bubbleSort(arr);
        int len = arr.length;
        if (len % 2 == 0) {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        } else {
            return arr[len / 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        double median = findMedian(nums);
        System.out.println("Median: " + median);
    }
}
