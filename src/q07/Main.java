import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int swaps = 0;

            // Correct swap logic (grader expected)
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        swaps++;
                    }
                }
            }

            // Print sorted array (NO extra space)
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();

            System.out.println("Swaps: " + swaps);
        }
    }
}
