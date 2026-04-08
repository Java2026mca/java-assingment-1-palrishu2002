import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Check multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        // Input first matrix
        int[][] A = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        int[][] B = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Result matrix
        int[][] C = new int[r1][c2];

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result matrix
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
    }
}
