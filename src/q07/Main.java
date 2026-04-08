import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int swapCount = 0;

        // Selection Sort (minimum swaps)
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;
            }
        }

        // Print without trailing space
        for(int i = 0; i < n; i++) {
            if(i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();

        System.out.println("Swaps: " + swapCount);
    }
}
