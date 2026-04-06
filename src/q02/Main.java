import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to print
        
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for pyramid structure
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                // Pascal's formula: C(n, k) = C(n, k-1) * (n-k+1) / k
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
