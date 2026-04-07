import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        // Spiral fill
        while (top <= bottom && left <= right) {

            // top row
            for (int i = left; i <= right; i++) {
                mat[top][i] = num++;
            }
            top++;

            // right column
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = num++;
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    mat[bottom][i] = num++;
                }
                bottom--;
            }

            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = num++;
                }
                left++;
            }
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        // Diagonal sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];               // primary
            sum += mat[i][n - 1 - i];       // secondary
        }

        // Avoid double count center
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        System.out.println(sum);
    }
}
