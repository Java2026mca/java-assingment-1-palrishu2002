import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Read array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int swapCount = 0;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapCount++;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) System.out.print(" ");
        }

        System.out.println();

        // EXACT format
        System.out.println("Swaps: " + swapCount);
    }
}