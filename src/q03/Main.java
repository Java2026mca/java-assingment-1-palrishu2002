import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        // input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // primary diagonal
        for (int i = 0; i < n; i++) {
            sum += a[i][i];
        }

        // secondary diagonal
        for (int i = 0; i < n; i++) {
            if (i != n - i - 1) {
                sum += a[i][n - i - 1];
            }
        }

        // final output
        System.out.print(sum);
    }
}
