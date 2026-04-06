import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num);

                // space only between numbers (NOT at end)
                if (j < i) {
                    System.out.print(" ");
                }

                num = num * (i - j) / (j + 1);
            }

            // next line
            if (i < n - 1) {
                System.out.println();
            }
        }
    }
}
