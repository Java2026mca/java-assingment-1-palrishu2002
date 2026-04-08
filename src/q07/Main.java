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

        // Bubble Sort (count passes with swaps)
        for(int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if(swapped) {
                swapCount++;   // count pass, not individual swaps
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
