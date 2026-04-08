import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // only ONE size

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        // input matrix A
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // input matrix B
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] C = new int[n][n];

        // multiplication
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // print result (NO extra space)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j > 0) System.out.print(" ");
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
    }
}
