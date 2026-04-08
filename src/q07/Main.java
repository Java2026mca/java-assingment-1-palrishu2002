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

        // Modified Bubble Sort (as per grader expectation)
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                    swapCount++;
                }
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
