import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int[][] A = new int[n][n];
int[][] B = new int[n][n];
int[][] C = new int[n][n];

// Input matrix A
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        A[i][j] = sc.nextInt();
    }
}

// Input matrix B
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        B[i][j] = sc.nextInt();
    }
}

// Multiply A and B → C
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        C[i][j] = 0;
        for (int k = 0; k < n; k++) {
            C[i][j] += A[i][k] * B[k][j];
        }
    }
}

// Print result matrix
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print(C[i][j]);
        if (j < n - 1) System.out.print(" ");
    }
    System.out.println();
}
        // TODO: Read two n×n matrices A and B, multiply them → print result C = A×B
        //       Input: matrix A row by row, then matrix B row by row
        //       Output: result matrix row by row, values separated by spaces
        //
        // Input:
        // 2
        // 1 2
        // 3 4
        // 5 6
        // 7 8
        //
        // Output:
        // 19 22
        // 43 50

    }
}
